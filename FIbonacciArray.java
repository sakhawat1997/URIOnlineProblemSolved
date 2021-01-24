package com.URISolved;

import java.util.Scanner;

public class FIbonacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j;
        long y=0,a,b,c,d,n,x;
        n = scanner.nextLong();
        for(i=1;i<=n;i++){
            x = scanner.nextLong();
            a=0;b=1;
            for(j=0;j<=x;j++){
                c=a+b;
                d=a;
                a=b;
                b=c;
                if(j==x){
                    y=d;
                    break;
                }
            }
            System.out.printf("Fib(%d) = %d\n",x,y);
        }
    }
}
