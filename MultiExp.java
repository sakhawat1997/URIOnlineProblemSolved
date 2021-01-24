package com.URISolved;

import java.util.Scanner;

public class MultiExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,value;
        value = scanner.nextInt();
        for (i=1;i<=10;i++){
            System.out.println(i+" x "+value+" = "+i*value);
        }
    }
}
