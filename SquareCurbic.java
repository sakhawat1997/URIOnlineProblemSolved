package com.URISolved;

import java.util.Scanner;

public class SquareCurbic {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i =1;i<=n;i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}
