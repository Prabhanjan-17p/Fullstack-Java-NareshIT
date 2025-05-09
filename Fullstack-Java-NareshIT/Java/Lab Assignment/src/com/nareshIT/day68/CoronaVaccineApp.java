package com.nareshIT.day68;

public class CoronaVaccineApp {
    public static void main(String[] args) {
        Runnable user1Task = () -> {
            User user1 = new User("Ramesh", 45, false);
            user1.bookDose();
        };

        Runnable user2Task = () -> {
            User user2 = new User("Suresh", 13, false);
            user2.bookDose();
        };

        Thread t1 = new Thread(user1Task);
        Thread t2 = new Thread(user2Task);

        t1.start();
        t2.start();
    }
}
