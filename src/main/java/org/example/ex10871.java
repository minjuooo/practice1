package org.example;

import java.util.Scanner;

public class ex10871 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (x>arr[i]) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
}
