package org.example;

import java.util.Scanner;

public class ex10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //바구니
        int m = sc.nextInt();   //m번 공을 바꿈
        int [] bag = new int [n+1]; //배열이니까 n+1
        for (int i = 1; i <= n; i++)   //처음에는 바구니에 적혀있는 번호와 같은 공이 들어있으니까 i=1부터 시작
            bag[i]=i;   //i번째 위치에 i값을 할당
            for (int i = 0; i < m; i++) {
               int a=sc.nextInt();
               int b=sc.nextInt();
               int temp = bag[a];
               bag[a]=bag[b];
               bag[b]=temp;
            }
        for (int i = 1; i <= n ; i++) {
            System.out.println(bag[i]+" ");
            
        }
    }
}
