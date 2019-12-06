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
public class UnaryDemo {

    public static void main(String[] args) {

        int result = -6;
        int i = 0;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        i = result--;
        //i = --result;
        // result is now -1
        System.out.println(i);
        System.out.println(result);
        
        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}
