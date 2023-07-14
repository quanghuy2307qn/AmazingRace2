/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amazingrace2;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author WBPC.VN
 */
public class AmazingRace2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showRecord();
    }
    
    public static void showRecord() {
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n","UFO",name,yob,weight,run());
            }
        };
        
        Pet racer[] = new Pet[]{ new Dog("CHIHUHU",2021, 0.5),
                                 new Dog("Vang oi", 1950 , 10.0),
                                 new Cat("Tom",1960 , 15.0),
                                 new Cat("Kitty",1990, 5.0),
                                 new Hamster("JERRY" , 1960 , 0.6),
                                 ufo //Object tao tu ANO van la PET, vao mang           
            
                                };
        // phan tu mang Pet thi phai la gan 1 con Pet nao do, CAT , DOG, 
        //Gan - new Dog(...);[i] - can toa do vung new nao do()
        //new Dog()... : Bo tri vung RAM trong HEAP, goi pheu do vao, lay moc
        //toa do vung NEW dua cho ai do
        //Da hinh quay tro lai
        //Vi mang pet , moi viec cham la cua CHA, cua PET, cha toan la ABSTRACT
        //Hoan toan ko dang lo, vi con da IMPLEMENT
        //Cha quat roi chay di chung may, the la 3 dua con chay theo
        //toc do cua rieng chung, da hinh xuat hien , OVERRIDE qua mat cha XH
        
        
        System.out.println("The record table");
        for (Pet x : racer) {
            // x = racer[0]
            x.showRecord();
            
        }
        // Tai thoi diem viec code the nay , ko so
        }
        
}
