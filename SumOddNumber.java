package com.URISolved;

import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y,sum=0;
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x>y){
            for (int i = x-1;i>y;i--){
                if (i%2!=0){
                    sum = sum+i;
                }
            }
        }else {
            for (int i = y-1;i>x;i--){
                if (i%2!=0){
                    sum = sum+i;
                }
            }
        }
        System.out.println(sum);
    }
}
