package com.URISolved;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x,sum =0,count=0;
        n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            x = scanner.nextInt();
            for (int j =1; j<x;j++){
                if (x%j==0){
                    sum +=j;
                }
            }
           if (sum == x){
               System.out.printf("%d eh perfeito\n",x);
           }else
               System.out.printf("%d nao eh perfeito\n",x);
           sum =0;
        }
    }
}
