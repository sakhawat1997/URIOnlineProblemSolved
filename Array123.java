package com.URISolved;

import java.util.Scanner;

public class Array123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i,j;
        while(true){
            n = scanner.nextInt();
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if((i==j && i+j==n-1 ) || i+j==n-1)
                        System.out.printf("2");
                    else if(i==j)
                        System.out.printf("1");
                    else
                        System.out.printf("3");
                }
                System.out.printf("\n");
            }
        }
    }
}
