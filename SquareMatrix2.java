package com.URISolved;

import java.util.Scanner;

public class SquareMatrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,n,m,k,l;
        while (true){
            n = scanner.nextInt();
            if(n==0)
                break;
            int [][] arr = new int[n][n];
            m=1;
            for(i = 0;i < n;i++){
                m=i+1;
                k=2;
                for(j = 0;j <= i;j++,m--){
                    arr[i][j]=m;
                }
                for(j=i+1;j<n;j++,k++){
                    arr[i][j]=k;
                }
                m++;
            }
            for(i = 0;i < n;i++){
                for(j = 0;j < n;j++){
                    if(j==0)
                        System.out.printf("%3d",arr[i][j]);
                    else
                        System.out.printf(" %3d",arr[i][j]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
