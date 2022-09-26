package com.MenuDriven;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        System.out.println("Menu Driven");
        int choice;
        while(true)
        {
            System.out.println("Select an option:");
            System.out.println("1.Add Student:");
            System.out.println("1.Search Student:");
            System.out.println("2.Delete student:");
            System.out.println("3.View all student:");
            System.out.println("3.exit:");
            Scanner sc= new Scanner(System.in);
            choice= sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add Student Selected");
                    break;

                case 2:
                    System.out.println("Search Student Selected");
                    break;
                case 3:
                    System.out.println("Delete Student Selected");
                    break;
                case 4:
                    System.out.println("view all students");
                    break;
                case 5:
                    System.exit(0);
            }






            }

        }

    }

