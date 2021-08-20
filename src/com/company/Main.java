package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(gg());
        int age = 33;
        int temp = 15;

        if (age < 45 && age > 10 && temp < 30 && temp > -10) {
            System.out.println("go for a walk");
        }
else if (age < 10 && temp > 0 && temp < 8) {
            System.out.println("go for a walk , but not for a long time");
        }

else if (age < 65 && temp < -10 && temp > 25)

    {
        System.out.println("stay home");
    }
else {
            System.out.println("stay home!");
        }



    }
    public static String gg (){
        String nameOfHuman = "Sam";
        int ageOfHuman = 50;
        return  nameOfHuman + " " + ageOfHuman;
    }
}
