/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.square;

/**
 *
 * @author KJ
 */
public class Square 
{
    private double side;
    
    public Square()
    {
        side=0.0;
    }
    
    public Square(double s)
    {
        if(s<0.0)
            ;
       else
            side=s;
    }
   
    public void setSide(double s)
    {
        side=s;
    }
    
    public double getSide()
    {
        return side;
    }
    
    public double area()
    {
        return side*side;       
    }
    
    public double per()
    {
        return side*4;
    }
}
