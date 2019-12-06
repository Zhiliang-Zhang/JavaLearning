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
public class MultiDimArrayDemo {

    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0] + "\n" + 
                names[0][2] + names[1][1]);
        //System.out.println(names[0][2] + names[1][1]);

    }
}
