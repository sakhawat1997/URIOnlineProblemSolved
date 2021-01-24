package com.URISolved;

import java.util.Scanner;

public class SimpleFactorial {
    public static void main(String[] args) {
        int n,sum =1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n>0){
            sum = sum *n;
            n--;
        }
        System.out.println(sum);
    }
}
