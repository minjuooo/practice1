package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class ex15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int a, b;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int sum = a+b;
           bw.write(sum + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
