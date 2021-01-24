package com.URISolved;

import java.util.Scanner;

public class AgesExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age,count=0;
        float avg,sum =0;
        while (true){
            age = scanner.nextInt();
            if (age<0)
                break;
            count++;
            sum = sum + age;
        }
        avg = sum/count;
        System.out.printf("%.2f\n",avg);
    }
}
