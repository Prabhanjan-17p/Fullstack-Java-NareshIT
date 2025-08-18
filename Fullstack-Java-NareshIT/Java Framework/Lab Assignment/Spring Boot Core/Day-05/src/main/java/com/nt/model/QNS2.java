package com.nt.model;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class QNS2 {

    /**
     * Cron expression: second minute hour day-of-month month day-of-week
     * "0 30 10 * * *" -> at 10:30:00 every day
     */
    @Scheduled(cron = "0 30 10 * * *")
    public void runTask() {
        System.out.println("Start on SaleReport :: " + new Date());
        // Do your processing here (avoid long blocking operations on the scheduler thread)
        System.out.println("End Sales Report on :: " + new Date());
    }
}
