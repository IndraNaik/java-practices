package org.example.PracticeSet;

import java.util.Scanner;

public class PracticeSets {

    public static void main(String[] args) {

         Que1:  // Write a program to sum three numbers
        System.out.println("Sum of three numbers");
        int a = 69;
        int b = 77;
        int c = 88;
        int sum = a+b+c;
        System.out.println("Sum of three numbers: " +sum);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of A");
        int A = sc.nextInt();
        System.out.println("enter value of B");
        int B = sc.nextInt();
        System.out.println("enter value of C");
        int C = sc.nextInt();
        int total = A+B+C;
        System.out.println(total);

        Que2 :     // program to calculate CGPA using marks of 3 subjects out of 100
        System.out.println("calculating cgpa using marks of 3 subjects");

        float sub1 = 75;
        float sub2 = 90;
        float sub3 = 89;

        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.println(cgpa);

        Que3:     // program which asks the user to enter his/her name and greets them with "Hello <Name>, have a good day" text

        System.out.println("what is your name");
        Scanner sca = new Scanner(System.in);
        String name = sca.next();
        System.out.println("Hello " + name + " have a good day");



        Que4:     // program to convert KMs to Meters

        System.out.println("Enter kilometers to convert it into meters");
        Scanner sc1 = new Scanner(System.in);
        float km = sc1.nextFloat();
        float meters = km*1000;
        System.out.println(km + " kilometers is equal to " +meters + " meters");


//        Que5 program to detect whether number entered by the user is integer or not?
        System.out.println("Enter a number");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hasNextInt());
    }
}
