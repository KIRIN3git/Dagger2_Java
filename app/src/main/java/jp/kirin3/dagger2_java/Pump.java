package jp.kirin3.dagger2_java;

import javax.inject.Inject;

public class Pump{

    private final Heater heater;

    @Inject
    Pump(Heater heater){
        this.heater = heater;
    }

    public void pumping(){
        System.out.println("pumping");
    }
}