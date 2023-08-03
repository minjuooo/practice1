package org.example;

import java.util.Scanner;

public class ex2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a != b && b != c && a != c) {
            int max;
            if (a > b) {  //a>b이면
                if (c > a) { //c>a>b
                    max = c;
                } else {  //a>b>c
                    max = a;
                }
            } else {  //b>a이면
                if (c > b) {   //c>b>a
                    max = c;
                } else {    //b>a>c
                    max = b;
                }
            }
            System.out.println(max * 100);
        }
            else {
                if (a==b && a==c) { //a=b=c
                    System.out.println(10000 + a*1000);
                }
                else {      //a=b 또는 a=c
                    if (a == b || a == c) {
                        System.out.println(1000 + a * 100);
                    } else {   //b=c
                        System.out.println(1000 + b * 100);
                    }
                }
        }
    }
}
