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
public class PrePostDemo {

    public static void main(String[] args) {
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        
        ++i;
        // prints 5
        System.out.println(i);
        
        // prints 6
        System.out.println(++i);
        System.out.println(i);
        
        // prints 6
        System.out.println(++i + "x");
        
        // prints 7
        System.out.println(i);
    }
}
