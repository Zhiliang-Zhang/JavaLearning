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
public class ArrayCopyDemo {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[9];
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 9);
        System.out.println(new String(copyTo));
        //System.out.println(copyFrom);
    }
;
}
