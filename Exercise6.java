package com.company;
import java.util.*;
/*
Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */

class InvalidInputExceptions extends Exception{
    @Override
    public String getMessage() {
        return "Invalid Input";
    }
}
class MaxInputExceptions extends Exception{
    @Override
    public String getMessage() {
        return "Max Input Reached Kindly Try Again";
    }
}
class MaxMultiExceptions extends Exception{
    @Override
    public String getMessage() {
        return "Input cant be greater than 7000 while multiplying";
    }
}
class Calculator {
    private int c,a,b;

    public void TakeUserInput() throws MaxInputExceptions  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number = ");
         a=sc.nextInt();
        System.out.println("Enter the Second Number =");
         b=sc.nextInt();
         if(a>=10000||b>=10000){
             throw new MaxInputExceptions();
         }
    }
    public void Choices() throws MaxInputExceptions,InvalidInputExceptions,MaxMultiExceptions{
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Following Operations You Want to Perform :-\n1-Addition\n-2-Subtraction\n3-Multiplication\n4-Divisions");
        c = sc.nextInt();
            switch (c) {
                case 1:
                    TakeUserInput();
                    System.out.println("Result is = "+(a+b));
                    break;
                case 2:
                    TakeUserInput();
                    System.out.println("Result is = "+(a-b));
                    break;
                case 3:
                    TakeUserInput();
                    if(a>7000||b>7000){
                        throw new MaxMultiExceptions();
                    }
                    System.out.println("Result is ="+a*b);
                    break;
                case 4:
                    try{
                    TakeUserInput();
                    System.out.println("Result is = "+(a/b));
                    break;
                    }
                    catch (ArithmeticException e){
                        System.out.println("Sorry Cannot Divide by zero");
                    }
                default:
//                    System.out.println("Invalid Input");
                    throw new InvalidInputExceptions();
            }
    }
}
public class Exercise6 {
    public static void main(String[] args) throws InvalidInputExceptions, MaxInputExceptions,MaxMultiExceptions {

        //        Ignore This it's Just a Header

        System.out.println("======================================");
        System.out.println("   WELCOME TO GUESS THE NUMBER GAME   ");
        System.out.println("======================================");


//      Operations Performed
        Calculator calc = new Calculator();
        calc.Choices();
//        calc.TakeUserInput();


         //            Ignore This it's Just a Footer

         System.out.println("=========================================");
         System.out.println("  This Calculator is Created by Dibendu  ");
         System.out.println("=========================================");

    }
}
