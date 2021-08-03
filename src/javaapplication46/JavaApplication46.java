/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author Dell
 */import java.util.Scanner;
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n=(int)(Math.random()*101);
       System.out.print("guess number 1 and 100");
       Scanner input=new Scanner(System.in);
       int guess;
     do
     {
         System.out.print("Enter your guess:");
         guess=input.nextInt();
        if(guess== n)
            System.out.println("gread");
     
      else  if (guess<n)
            System.out.println("the guess is less than");
     
      else 
          System.out.println("the guess is larg ");
       
     }while (guess!= n);
     System.out.println();
        // TODO code application logic here
    }
}
