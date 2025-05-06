package com.nareshIT.day64;

public class PetrolPumpSimulation {
    public static void main(String[] args) {
        PetrolPump p1 = new PetrolPump();
        Car c1 = new Car("TATA",p1);
        Car c2 = new Car("SAFARI",p1);
        Car c3 = new Car("NAXON",p1);
        Car c4 = new Car("FORD",p1);
//        Car [] cc ={c1,c2,c3,c4};
//        for (Car i:cc){
//            Thread t1 = new Thread(i);
//            t1.start();
//        }
        Thread [] th = {new Thread(c1),new Thread(c2),new Thread(c3),new Thread(c4)};
        for (Thread t : th){
            t.start();
        }



    }
}
