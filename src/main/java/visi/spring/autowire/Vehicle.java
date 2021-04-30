package visi.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {

    @Autowired
    @Qualifier("carEngine")
    private Engine engine;

    /*@Autowired
    @Qualifier("carEngine")
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Vehicle(){
    }

    *//*@Autowired*//*
    public Vehicle(Engine engine) {
        this.engine = engine;
    }*/

    protected void startJourney(){
        if(engine != null ){
            engine.start();
            System.out.println("Name of the Engine :" + engine.getEngineName());
        } else {
            System.out.println("You can't start the journey");
        }
    }
}
