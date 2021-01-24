package com.URISolved;

import java.util.Scanner;

public class ArrayFill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,value=0;
        x = scanner.nextDouble();
        for (int i =0;i<100;i++){
            System.out.printf("N[%d] = %.4f\n",i,x);
            x/=2;
        }
    }
}
