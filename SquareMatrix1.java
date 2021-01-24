package com.URISolved;

import java.util.Scanner;

public class SquareMatrix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,n,x;
        while(true){
            n = scanner.nextInt();
            if(n==0)
                break;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    x = i;
                    if(j < x)
                        x = j;
                    if(n-i+1 < x)
                        x = n-i+1;
                    if(n-j+1 < x)
                        x = n-j+1;
                    System.out.printf("%3d",x);
                    if(j < n)
                        System.out.printf(" ");
                    else
                        System.out.printf("\n");
                }
            }
            System.out.printf("\n");
        }
    }
}
