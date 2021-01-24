package com.URISolved;

import java.util.Scanner;

public class ArrayReplacment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] x = new int[10];
        for (int i=0;i<x.length;i++){
            x[i] = scanner.nextInt();
            if (x[i]<=0){
                x[i] = 1;
            }
            System.out.printf("X[%d] = %d\n",i,x[i]);
        }
    }
}
