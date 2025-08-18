package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.entity.Student;

@Repository("stdRepo")
public class StudentDAOImpl implements IStudentDAO {
	@Autowired
	private DataSource ds;

	private final String INSERT_DATA = "INSERT INTO registrations (name, email, course, registrationDate) VALUES(?, ?, ?, ?)";
	private final String FETCH_ALL = "SELECT * FROM registrations ";
	private final String DELETE_BY_ID = "DELETE FROM registrations WHERE id = ?";
	private final String UPDATE_BY_ID = "UPDATE registrations SET name = ?, email = ?, course = ? WHERE id = ?";
	private final String SEARCH_BY_NAME = "SELECT * FROM registrations WHERE name LIKE ?";

	@Override
	public int insertStudentDetails(String name, String email, String course, LocalDate ldate) throws Exception {
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement stm = con.prepareStatement(INSERT_DATA);) {

			stm.setString(1, name);
			stm.setString(2, email);
			stm.setString(3, course);
			stm.setDate(4, java.sql.Date.valueOf(ldate));

			count = stm.executeUpdate();

		} catch (Exception e) {
			throw e;
		}
		return count;
	}

	@Override
	public List<Student> fetchAllDetals() throws Exception {
		List<Student> list;
		try (Connection con = ds.getConnection();
				PreparedStatement stm = con.prepareStatement(FETCH_ALL);
				ResultSet rs = stm.executeQuery();) {

			list = new ArrayList<Student>();
			while (rs.next()) {
				Student std = new Student();
				std.setId(rs.getLong(1));
				std.setName(rs.getString(2));
				std.setEmail(rs.getString(3));
				std.setCourse(rs.getString(4));
				std.setRegistrationDate(rs.getDate(5).toLocalDate());

				list.add(std);

			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public int updateDetails(String name, String email, String course,long id) throws Exception {
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement stm = con.prepareStatement(UPDATE_BY_ID)) {

			stm.setString(1, name);
			stm.setString(2, email);
			stm.setString(3, course);
			stm.setLong(4, id); 

			count = stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		}
		return count;
	}

	@Override
	public int deleteDetails(long id) throws Exception {
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement stm = con.prepareStatement(DELETE_BY_ID)) {

			stm.setLong(1, id);
			count = stm.executeUpdate();

		} catch (Exception e) {
			throw e;
		}
		return count;
	}

	@Override
	public List<Student> searchByName(String name) throws Exception {
		List<Student> list = new ArrayList<>();
		try (Connection con = ds.getConnection(); PreparedStatement stm = con.prepareStatement(SEARCH_BY_NAME)) {

			stm.setString(1, "%" + name + "%");
			try (ResultSet rs = stm.executeQuery()) {
				while (rs.next()) {
					Student std = new Student();
					std.setId(rs.getLong(1));
					std.setName(rs.getString(2));
					std.setEmail(rs.getString(3));
					std.setCourse(rs.getString(4));
					std.setRegistrationDate(rs.getDate(5).toLocalDate());
					list.add(std);
				}
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

}
