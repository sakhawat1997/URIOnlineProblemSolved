package com.URISolved;

import java.util.Scanner;

public class RemainingNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        for (int i =1; i<=10000;i++){
            if (i%value == 2){
                System.out.println(i);
            }
        }
    }
}
