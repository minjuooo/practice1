package org.example;

import java.util.Scanner;

public class ex2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
