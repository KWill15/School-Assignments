/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.saleprice;
import javax.swing.JOptionPane;

/**
 *
 * @author KJ
 */
public class SalePrice {

    public static void main(String[] args) 
    {
    int num;
    double price;
    String str1, str2;
    
    str1 = JOptionPane.showInputDialog("Please input the number of items: ");
    num = Integer.parseInt(str1);
    System.out.println("Please input the number of items:\n"+num);
    str2 = JOptionPane.showInputDialog("Please input the price of each item: ");
    price = Double.parseDouble(str2);
    System.out.println("Please input the price of each item: \n"+price);
    
    if(verifyNumOfItem(num)==false)
        System.out.println("Invalid number of items was inputed!!!");
    else if(verifyPrice(price)==false)
        System.out.println("Invalid Price was inputted!!!");
    else
        showResult(num, price);
        
    System.exit(0);
      }
    
    public static boolean verifyNumOfItem(int check)
    {       
       if(check>0)
           return true;
       else
       {
           return false;         
       }
            
    }
    
    public static boolean verifyPrice(double check)
    {       
       if(check>0)
           return true;
       else
       {
           return false;         
       }
            
    }
    
    public static void showResult(int num, double price)
    {
        System.out.print("The total price is $"+num*price);
    }
}
