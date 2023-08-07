package org.example;

import java.util.Scanner;

public class ex10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;

            if (a == 0 && b == 0) {
                sc.close();
                break;
            }
            System.out.println(sum);
        }
    }
}
