package org.example;

import java.util.Scanner;

public class ex25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, count, total;
        total = sc.nextInt();
        count = sc.nextInt();
        for (int i = 0; i <count; i++) {
            a = sc.nextInt();    //가격
            b = sc.nextInt();    //개수
            total = total - (a * b);
        }
        if (total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
