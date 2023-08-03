package org.example;

import java.util.Scanner;

public class ex2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int min = a*60+b;
        min += c;
        int hour = (min/60)%24;
        int minute = min%60;
        System.out.println(hour +" "+minute);
    }
}
