package org.example;

import java.util.Scanner;

public class ex11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a+b;
            System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+c);
        }
    }
}
