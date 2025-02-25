package org.example.ChapterOne;

import java.util.Scanner;

public class One {


    // Write a Java program to calculate percentage of a given students. His marks from 5 subjects must be taken as input from keyboard.

    public static void main(String[] args) {
        System.out.println("Calculating marks of students");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of eng: ");
        int eng = sc.nextInt();
        System.out.println("Enter the marks of phy: ");
        int phy = sc.nextInt();
        System.out.println("Enter the marks of math: ");
        int math = sc.nextInt();
        System.out.println("Enter the marks of sci: ");
        int sci = sc.nextInt();
        System.out.println("Enter the marks of soc: ");
        int soc = sc.nextInt();

        int total = eng+phy+math+sci+soc;
        System.out.println(total);

       int percent = total*100/500;
        System.out.println(percent);

    }

}
