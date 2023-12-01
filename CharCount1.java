/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.charcount1;

import java.io. *;
import java.util.Scanner;

/**
 *
 * @author KJ
 */
public class CharCount1 {

    public static void main(String[] args) throws IOException
    {
        //I apologize for the name being CharCount1 instead of CharCount
        //I had some initial issues with the file and ruined it
        int size;
        char letter;
        int z;
        
        Scanner keyboard = new Scanner(System.in);
       
        
        System.out.println("Enter the filename: ");
        String filename=keyboard.nextLine();
        
        File file = new File(filename);        
        while (!file.exists())
        {          
                System.out.print("File doesn't exist: ");
              System.out.println("Enter the filename: ");
              filename=keyboard.nextLine();
              file=new File(filename);
        }   
        
        Scanner inputFile=new Scanner(file);
        
        PrintWriter outputFile = new PrintWriter("output.txt");
        
        while(inputFile.hasNext())
        {           
            String line=inputFile.nextLine();
            size=line.length();
            System.out.println(line+" (count "+size+")");
            z=1;
            for(int i=size;i>0;i--)
            {
                letter=line.charAt(size-z);
                outputFile.print(letter); 
                z++;
            }
            outputFile.println();
        }
        inputFile.close();
        outputFile.close();
    }
}
