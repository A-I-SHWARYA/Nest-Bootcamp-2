package com.calculator;

import java.util.Scanner;

public class Menucalc {
    public static void main(String[] args) {
        int choice,x,y,result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number\n");
        x= sc.nextInt();
        System.out.println("Enter the second number\n");
        y= sc.nextInt();

        while(true)
        {
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice \n");
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                        result=x+y;
                         System.out.println(result);
                         break;

                case 2:
                    result=x-y;
                    System.out.println(result);
                    break;

                case 3:
                    result=x*y;
                    System.out.println(result);
                    break;

                case 4:
                    result=x/y;
                    System.out.println(result);
                    break;
                case 5:
                    System.exit(0);





            }
        }


    }
}
