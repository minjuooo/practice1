package org.example;

import java.util.Scanner;

public class ex2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M;
        H = sc.nextInt();
        M = sc.nextInt();
        sc.close();
        if (M < 45) {
            H--;
            M = (M - 45) + 60;
            if (H < 0) {
                H = 23;
            }
            System.out.println(H+":"+M);
        } else
        System.out.println(H+":"+(M-45));
    }
}
