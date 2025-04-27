package com.nareshIT.day42;

public class HistoryStudent extends Student{
	private int historyMarks;
	private int civicsMarks;
	@Override
	public int getPercentage() {
		int sum = (historyMarks+civicsMarks)/2;
		return sum;
	}
	public HistoryStudent(int historyMarks, int civicsMarks) {
		super();
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

}
