package javalearning;


import java.util.Arrays;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zzl
 */
public class ArrayCopyOfDemo {

    public static void main(String[] args) {

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};

        //char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        //char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 9);
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
    }
}