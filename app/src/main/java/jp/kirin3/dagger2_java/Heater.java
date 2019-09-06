package jp.kirin3.dagger2_java;

import javax.inject.Inject;

public class Heater{

    public Boolean isHot = false;

    @Inject
    Heater(){}

    public void heating(){
        isHot = true;
        System.out.println("heating");
    }

    public Boolean isHot(){
        return isHot;
    }
}