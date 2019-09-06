package jp.kirin3.dagger2_java;

import javax.inject.Inject;

public class CoffeeMaker {

    // Heater heater = new Heater();　
    // Pump pump = new Pump();
    @Inject Heater heater;
    @Inject Pump pump;

    // コンストラクタにも付ける
    @Inject
    CoffeeMaker(){
    }

    public void drip(){
        heater.heating();
        pump.pumping();
        System.out.println("Complete!");
    }
}