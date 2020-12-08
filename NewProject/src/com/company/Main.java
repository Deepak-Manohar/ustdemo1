package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("Spring");
        }
        else if (n % 3 == 0) {
            System.out.println("Boot");
        } else
            System.out.println(n);

    }
}
