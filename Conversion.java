/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversion;
import javax.swing.JOptionPane;
/**
 *
 * @author KJ
 */
public class Conversion {

    public static void main(String[] args) {
    double m;
    String str1;
    
    str1 = JOptionPane.showInputDialog("Enter a distance in meters: ");
    m=Double.parseDouble(str1);
    while(m<=0)
    {
        JOptionPane.showMessageDialog(null, "ERROR!!!\nPlease input a positive number for meters.");
      str1 = JOptionPane.showInputDialog("Enter a distance in meters: ");
    m=Double.parseDouble(str1);  
    }
    System.out.println("Enter a distance in meters: "+m);
    
    menu(m);
    }
    
    /*
    This method takes the meters, converts it into kilometers, and shows the result
    */   
    public static void showKilometers(double m)
    {
        double kilo;
        kilo=m*0.001;
        System.out.println(m+" meters is "+kilo+" kilometers");
    }
     /*
    This method takes the meters, converts it into feet, and shows the result
    */
    public static void showFeet(double m)
    {
        double feet;
        feet=m*3.281;
        System.out.println(m+" meters is "+feet+" feet");
    }   
    /*
    This method takes the meters, converts it into inches, and shows the result
    */
    public static void showInches(double m)
    {
        double inch;
        inch=m*39.27;
        System.out.println(m+" meters is "+inch+" inches");
    }
     /*
    This method takes a number between 1 and 4 showing the different measurments, with 4 ending the loop
    */
    public static void menu(double m)
    {
        int choice=0;
        while(choice!=4)
        {
        System.out.println("1. Convert to Kilometers\n2. Convert to Inches\n3. Convert to Feet\n4. Quit the Program");
        String str1;
        str1 = JOptionPane.showInputDialog("Enter your choice: ");
        choice=Integer.parseInt(str1);
       
       if(choice==1)
       {
           System.out.println("\nEnter your choice: 1");
           showKilometers(m);
       }
       else if(choice==2)
       {
           System.out.println("\nEnter your choice: 2");
           showInches(m);
       }
       else if(choice==3)
       {
           System.out.println("\nEnter your choice: 3");
           showFeet(m);
       }
       else if(choice==4)
       {
           System.out.println("Enter your choice: 4");
           System.out.println("Bye");
       }
       else
           System.out.println("ERROR!!!\nPlease input a valid choice between 1 and 4");
       }
    }
    
}
