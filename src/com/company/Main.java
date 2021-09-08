package com.company;

public class Main {

    public static void main(String[] args) {                        //
        zippo("rattle", 13);                             //1
    }                                                               //15
    public static void baffle(String blimp) {                       //
        System.out.println(blimp);                                  //6
        zippo("ping", -5);                               //7
    }                                                               //11
    public static void zippo(String quince, int flag) {             //
        if (flag < 0) {                                             //2+8
            System.out.println(quince + " zoop");                   //9
        } else {                                                    //3
            System.out.println("ik");                               //4
            baffle(quince);                                         //5
            System.out.println("boo-wa-ha-ha");                     //12
        }                                                           //13
    }                                                               //10
}                                                                   //14
