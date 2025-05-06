package com.nareshIT.day64;

public class PetrolPump {
    public synchronized void  refillCar(String carName){
        System.out.println(carName + " Started refilling... ");
        try{
            Thread.sleep(3000);
            System.out.println(carName + " Complete refilling... ");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}