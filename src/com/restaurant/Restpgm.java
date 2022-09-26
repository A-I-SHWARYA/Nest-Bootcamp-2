package com.restaurant;

import java.util.Scanner;

public class Restpgm {
    public static void main(String[] args) {
        int choice,qty,price1=0,price2=0,price3=0,price4=0,price5=0,sum=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("------MENU------");
            System.out.println("1.Tea---10rs");
            System.out.println("2.Coffee--15rs");
            System.out.println("3.Juice--45rs");
            System.out.println("4.Icecream--30rs");
            System.out.println("5.chocolate--20rs");
            System.out.println("6.Bill");
            System.out.println("7.Exit");
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the quantity");
                    qty= sc.nextInt();
                    price1=price1+(10*qty);
                    System.out.println("The price is:"+price1);
                    break;
                case 2:
                    System.out.println("Enter the quantity");
                    qty= sc.nextInt();
                    price2=price2+(15*qty);
                    System.out.println("The price is:"+price2);
                    break;
                case 3:
                    System.out.println("Enter the quantity");
                    qty= sc.nextInt();
                    price3=price3+(45*qty);
                    System.out.println("The price is:"+price3);
                    break;
                case 4:
                    System.out.println("Enter the quantity");
                    qty= sc.nextInt();
                    price4=price4+(30*qty);
                    System.out.println("The price is:"+price4);
                    break;
                case 5:
                    System.out.println("Enter the quantity");
                    qty= sc.nextInt();
                    price5=price5+(20*qty);
                    System.out.println("The price is:"+price5);
                    break;
                case 6:
                    sum=price1+price2+price3+price4+price5;
                    System.out.println("The sum is:"+sum);
                    break;
                case 7:
                    System.exit(0);













            }
        }
    }

    }

