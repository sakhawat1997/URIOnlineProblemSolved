package com.URISolved;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        for (int i =1;i<=number;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
