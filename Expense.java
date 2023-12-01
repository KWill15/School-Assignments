/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expense;
import javax.swing.JOptionPane;
/**
 *
 * @author KJ
 */
public class Expense {

    public static void main(String[] args) {
       int Days; 
        String d;
d = JOptionPane.showInputDialog(
        "Please input the number of days");
Days = Integer.parseInt(d);
while(Days<=0)
{
    d = JOptionPane.showInputDialog(
        "Please input the number of days");
Days = Integer.parseInt(d);
}
        double Exp; //This is getting the amount for Expense
        String e;
e = JOptionPane.showInputDialog(
        "Please input daily expense");
Exp = Double.parseDouble(e);
while(Exp<=0)
{
    e = JOptionPane.showInputDialog(
        "Please input daily expense");
Exp = Double.parseDouble(e);
}
System.out.println("Please input the number of days\n"+Days);

System.out.println("Please input daily expense\n"+Exp);

System.out.println("Days\t\tExpense");

        double j=Exp;
for(int i=1;i<=Days;i++) //This is printing the Days and Expense
{
    System.out.println(i+"\t\t$"+j);
    j=j+Exp;
}

System.exit(0);


    }
}
