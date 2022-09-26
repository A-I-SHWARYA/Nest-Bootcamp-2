package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Menuemp {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Driven");
        int choice;
        String emp;
        while (true) {
            System.out.println("1.Add Employee:");
            System.out.println("2.View Employee:");
            System.out.println("3.exit:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    emp = sc.next();
                    obj.add(emp);
                    break;
                case 2:
                    System.out.println(obj);
                    break;
                case 3:
                    System.exit(0);
            }


        }
    }
}


