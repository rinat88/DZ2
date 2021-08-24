package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int age = 33;
        int temp = 15;
        if (age < 45 && age > 10 && temp < 30 && temp > -10) {
            System.out.println("go for a walk");
        } else if (age < 10 && temp > 0 && temp < 8) {
            System.out.println("go for a walk , but not for a long time");
        } else if (age < 65 && temp < -10 && temp > 25) {
            System.out.println("stay home");
        } else {
            System.out.println("stay home!");
        }
        System.out.println(gg());
        sw();
    }
    public static void sw(){
        String name1 = "Kkk";
        String name2 = "Hhh";
        String name3 = "Lll";
        switch (name1){
            case "Kkk":
                System.out.println(name1);
                break;
            case "Hhh":
                System.out.println(name2);
                break;
            case "Lll":
                System.out.println(name3);
                break;
            default:
                System.out.println("No this name" );
        }

    }

    public static String gg() {
        String nameOfHuman = "Sam ";
        int ageOfHuman = 50;
        String info = nameOfHuman + ageOfHuman;
        return info;

    }
}
