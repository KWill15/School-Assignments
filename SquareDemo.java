/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.square;
import java.util.Scanner;
/**
 *
 * @author KJ
 */
public class SquareDemo {
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner 
                (System.in);
        System.out.println("Please input a positive value for a side: ");
        double value = keyboard.nextDouble();
        
        Square s = new Square(value);
        
        System.out.println("The squares side is "+s.getSide());
        System.out.println("The squares area is "+s.area());
        System.out.println("The squares perimeter is "+s.per());
    }
}
