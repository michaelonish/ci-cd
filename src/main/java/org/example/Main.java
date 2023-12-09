package org.example;

import org.example.objects.Dice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    Dice dice = new Dice(6, "Red");
    int result = dice.roll();

    Dice dice1 = new Dice(10, "Blue");
    int[] rolls = dice.rollMany(5);


    Dice dice3 = new Dice(8, "Green");
    String result1 = dice.toString();
}