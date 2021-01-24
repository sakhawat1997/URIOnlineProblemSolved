package com.URISolved;

import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x;
        n = scanner.nextInt();
        for (int i= 1;i<=n;i++){
            x = scanner.nextInt();
            if (x%2==0){
                if (x>0){
                    System.out.println("EVEN POSITIVE");
                }else if (x<0){
                    System.out.println("EVEN NEGATIVE");
                }
            }
            if (x%2!=0){
                if (x>0){
                    System.out.println("ODD POSITIVE");
                }else if (x<0){
                    System.out.println("ODD NEGATIVE");
                }
            }
            if (x==0){
                System.out.println("NULL");
            }
        }
    }
}
