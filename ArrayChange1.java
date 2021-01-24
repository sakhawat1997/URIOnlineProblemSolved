package com.URISolved;

import java.util.Scanner;

public class ArrayChange1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n [] = new int[20];
        for(int i=0;i<=19;i++)
            n[i] = scanner.nextInt();
        for(int i=0,j=19;i<10;i++,j--){
            int k=n[i];
            n[i]=n[j];
            n[j]=k;
        }
        for(int i=0;i<20;i++){
            System.out.printf("N[%d] = %d\n",i,n[i]);
        }
    }
}
