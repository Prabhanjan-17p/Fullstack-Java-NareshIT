package com.nt.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "payroll")
public class PayrollProperties {
    private String companyName;
    private String currency;
    private double taxRate;
    private boolean overtimeEnabled;

    private List<String> departments;
    private Map<String, Double> salaryBands;
    private HolidayPolicy holidayPolicy;
    private List<Benefit> benefits;
}
