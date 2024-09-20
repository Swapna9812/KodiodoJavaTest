package com.model;

import java.util.Scanner;

public class factors{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        System.out.println("Factors of"+num+"(excluding 1 &"+num+"):");
        for (int i = 13; i < num; i++) {
            if (num % i == 0) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
   