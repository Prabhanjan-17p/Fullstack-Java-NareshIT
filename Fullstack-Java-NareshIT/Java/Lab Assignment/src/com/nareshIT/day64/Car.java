package com.nareshIT.day64;

public class Car implements  Runnable{
    String name ;
    PetrolPump pump;
    public  Car(String name,PetrolPump pump){
        this.name = name;
        this.pump = pump;
    }
    @Override
    public void run() {
        pump.refillCar(name);
    }
}