/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardemo;
import java.util.Scanner;
/**
 *
 * @author KJ
 */
public class CarDemo {

    public static void main(String[] args) {
         Scanner keyboard = new Scanner 
                (System.in);
        System.out.println("Please input the year of your Car: ");
        int y = keyboard.nextInt();
        
        System.out.println("Please input what make your Car is: ");
        String m = keyboard.next();
        
        Car c = new Car(y,m);
        
        System.out.println("The "+c.getYear()+" "+c.getMake()+" is currently going "+c.getSpeed()+" mph");
        for(int i=0;i<=4;i++)
        {
            System.out.println("You accelerate to "+c.accel()+" mph");
        }
        for(int i=0;i<=4;i++)
        {
            System.out.println("You brake, lowering your speed to "+c.brake()+" mph");
        }
    }
}
