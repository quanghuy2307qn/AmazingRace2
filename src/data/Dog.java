/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Random;

/**
 *
 * @author WBPC.VN
 */
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
         Random mayNgauNhien  = new Random();
         return mayNgauNhien.nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
         System.out.printf("|%-10s|%-10s|%4d|%4.1f|%7.2f|\n",
                           "DOG",name,yob,weight,run());
    }
    
    
}
