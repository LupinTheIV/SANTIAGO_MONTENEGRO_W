/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unititest;

import java.util.Scanner;
import com.mycompany.unititest.Operations;
import java.util.InputMismatchException;
import java.util.Random;
/*
Por: Santiago Montenegro Woodcock - 506211009      
*/

public class UnitiSample {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        
        System.out.println("--Wellcome--");
        int userResult;
        do{  
        System.out.println("\n1. Add next number");
        System.out.println("2. Random Number and the same increased by 30%");
        System.out.println("10. Based two numbers return devisible");
        System.out.println("14. Triangle type by sides");
        System.out.println("19. Exit");
        System.out.println("Please type one of the number options: ");
        userResult = sc.nextInt();
            switch(userResult){
                case 1:
                    System.out.println("Type an integer number");
                    String userNumber = sc.next();
                    int userNumberint = Integer.parseInt(userNumber);
                    int nextResult = Operations.NextNumber(userNumberint);
                    System.out.println(nextResult);
                    break;
                case 2:
                     Random random = new Random();
                     int number = random.nextInt(201);
                     double result = Operations.Random_by30(number);
                     System.out.println("Incresed by 30% equals: "+result);
                    break;
                case 10:
                    System.out.println("Type the divisor number");
                    int firstdiv = sc.nextInt();
                    System.out.println("Type the dividend number");
                    int secdiv = sc.nextInt();
                    boolean resultDiv = Operations.IsDivisible(firstdiv, secdiv);
                    if (resultDiv){
                        System.out.println(secdiv + " is divisible into "+ firstdiv);
                    }else{
                        System.out.println(secdiv + " is not divisible into "+ firstdiv);
                    }
                    break;
                case 14:
                        System.out.println("Type the longitud of the triangle");
                        System.out.println("Lado 1: ");
                        int lado1 = sc.nextInt();
                        System.out.println("Lado 2: ");
                        int lado2 = sc.nextInt();
                        System.out.println("Lado 3: ");
                        int lado3 = sc.nextInt();
                        String resultTri = Operations.triangleType(lado1, lado2, lado3);
                        System.out.println("The triangle is: "+Operations.triangleType(lado1, lado2, lado3));
                        
                        if(resultTri.equals("Unknown")){
                            System.out.println("This is not a Triangle!");
                        }
                    break;
                case 19:
                    System.out.println("Thanks for using the app");
                    break;
                default:
                    System.out.println("Invalid option, try again");
                    break;
            }
        }while(userResult != 19);
    }
    //Este es la prueba para Branch_number_2
}
