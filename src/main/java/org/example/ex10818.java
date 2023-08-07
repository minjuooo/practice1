package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ex10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);   //오름차순으로 정렬한 후에 배열0번째랑 마지막을 구하면 최소랑 최대값임
        System.out.println(arr[0]+" "+arr[n-1]);

    }
}
