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
public class Cat extends Pet{
    public static final double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        Random rd = new Random(); // rd nam toa do vung new
                                  // Trong vung new co ham .nextDouble() quan trong
        //return rd.nextDouble() * MAX_SPEED;
               //(0....1)      * 50 coi nhu dc con so sat 50;
        return new Random().nextDouble() * MAX_SPEED;
        //     object ko them dat ten, xai vung new 1 lan roi bo luon
        //  Cong ty moi truong do thi GARBAGE COLLECTOR
        //LENH GOM RAC NGAY LAP TUC System.gc();
    }

    @Override
    public void showRecord() {
      System.out.printf("|%-10s|%-10s|%4d|%4.1f|%7.2f|\n",
                           "CAT",name,yob,weight,run());
    }
    
}
