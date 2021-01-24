package com.URISolved;

import java.util.Scanner;

public class ArrayFill2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n [] = new int[10];
        for (int i =0;i<n.length;i++){
            n[i]  = x;
            System.out.printf("N[%d] = %d\n",i,x);
            x*=2;
        }
    }
}
