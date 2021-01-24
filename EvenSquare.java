package com.URISolved;

import java.util.Scanner;

public class EvenSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        value = scanner.nextInt();
        for (int i =1;i<=value;i++){
            if (i%2==0){
                System.out.printf("%d^%d = %d\n", i, i,(int) Math.pow(i, 2));
            }
        }
    }
}
