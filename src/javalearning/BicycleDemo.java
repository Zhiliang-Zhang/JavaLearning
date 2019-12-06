package javalearning;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zzl
 */
public class BicycleDemo {
    int cadence = 0;
    int speed = 0;
    int gear =1;
    String mmm = null;
    
    void changeCadence(int newValue){
        cadence = newValue;
    }
    
    void changeGear(int newValue){
        gear = newValue;
    }
    
    void speedUp(int increment){
        speed = speed + increment;
    }
    
    void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    void name (String mmm){
        this.mmm = mmm;
    }
    
    void printStates(){
        System.out.println(mmm + "cadence:" +
                cadence + " speed:" 
                + speed + " gear:" + gear);
    }
    
    
}
 
