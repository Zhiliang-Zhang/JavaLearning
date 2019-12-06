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
public class BicycleDemo2 {
    public static void main(String[] args){
        
        BicycleDemo bike1 = new BicycleDemo();
        BicycleDemo bike2 = new BicycleDemo();
        
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.name ("bike1: \n");
        bike1.printStates();
        
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.name ("bike2: \n");
        bike2.changeGear(3);
        bike2.printStates();
    }
}