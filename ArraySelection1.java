package com.URISolved;

import java.util.Scanner;

public class ArraySelection1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a [] = new float[100];
        for (int i =0;i<a.length;i++){
            a[i] = scanner.nextFloat();
            if (a[i]<=10)
                System.out.printf("A[%d] = %.1f\n",i,a[i]);
        }
    }
}
