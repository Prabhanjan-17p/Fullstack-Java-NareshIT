package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Travel;
import com.nt.repository.TravelRepository;

@Service
public class TravelServiceIMPL implements ITravelService {
	@Autowired
	private TravelRepository repo;

	@Override
	public void addTravel(Travel travel) {
		Travel save = repo.save(travel);
	}

	@Override
	public Iterable<Travel> getAllTravels() {
		Iterable<Travel> all = repo.findAll();
		return all;
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		Optional<Travel> byId = repo.findById(id);
		return byId;
	}

	@Override
	public void deleteTravelById(Long id) {
		repo.deleteById(id);
	}

	@Override
	public boolean existsById(Long id) {
		boolean existsById = repo.existsById(id);
		return existsById;
	}

	@Override
	public long count() {
		return repo.count();
	}

	@Override
	public void delete(Travel travel) {
		repo.delete(travel);
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
	}

}
