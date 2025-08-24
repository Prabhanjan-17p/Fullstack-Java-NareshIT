package com.nt.model;

import lombok.Data;

@Data
public class HolidayPolicy {
	private int maxLeaves;
	private boolean carryForward;
	private int paidLeaves;
}
