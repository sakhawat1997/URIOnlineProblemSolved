package com.URISolved;

import java.util.Scanner;

public class HiestPossitionExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0,temp=0,value,n=100;

        for (int i =1;i<=n;i++){
             value = scanner.nextInt();
             if (value < temp){
                 temp = temp;
                 counter = counter;
             }
             else {
                 temp = value;
                 counter = i;
             }
        }
        System.out.println(temp);
        System.out.println(counter);
    }
}
