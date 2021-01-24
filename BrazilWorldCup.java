package com.URISolved;

import java.util.Scanner;

public class BrazilWorldCup {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()==true){
            n = scanner.nextInt();
            if (n==0){
                System.out.println("vai ter copa!");
            }
            else if (n>0){
                System.out.println("vai ter duas!");
            }
        }
    }
}
