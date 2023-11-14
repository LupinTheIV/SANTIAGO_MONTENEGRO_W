/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unititest;


/**
 *
 * @author Santy
 */
public class Operations {
    
    public static int NextNumber(int userNumber){
        return userNumber + 1;
    }
    
    public static double Random_by30(int number){
        double increased = number+(0.3*number);
        System.out.println("The Random number is: "+number);
        return increased;
    }
    public static boolean IsDivisible(int firstNumber, int secondNumber){
        int moduleResult = secondNumber % firstNumber;
        return moduleResult == 0;
    }
    public static String triangleType(double lado1, double lado2, double lado3){
        String result = "";
        if(lado1<=0 || lado2<=0 || lado3<=0){
            System.out.println("Invalid input");
            result = "Unknown";
        }else if(lado1>=(lado2+lado3) || lado3>=(lado2+lado1) || lado2>=(lado1+lado3)){
            result = "Unknown";
        }else if (lado1 == lado2 && lado2 == lado3){
            result = "Equilateral";
        }else if(lado1 == lado2 || lado3 == lado1 || lado3 == lado2){
            result = "Isosceles";
        }else{
            result = "Scalene";
        }
        return result;
    }
}
