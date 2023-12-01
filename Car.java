/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardemo;

/**
 *
 * @author KJ
 */
public class Car 
{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int y, String m)
    {
      make=m;
      speed=0;
      if (y<1885) //First Car was made around 1885/1886 so any car before doesnt exist
          ;
      else
        yearModel=y;
    }
    
    public int getYear()
    {
        return yearModel;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int accel()
    {
        speed=speed+5;
        return speed;
    }
    
    public int brake()
    {
        speed=speed-5;
        return speed;
    }
    
}
