package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("ns")
public class NumberService {
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return number + " is Even";
        } else {
            return number + " is Odd";
        }
    }
}
