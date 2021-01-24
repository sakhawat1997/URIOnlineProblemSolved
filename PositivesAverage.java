package com.URISolved;

import java.util.Scanner;

public class PositivesAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp=0,sum,average;
        int counter=0;
        for (int i =1;i<=6;i++){
            sum = scanner.nextDouble();
            if (sum>0){
                counter++;
                temp = temp + sum;
            }
        }
        average = temp/counter;
        System.out.printf("%d valores positivos\n",counter);
        System.out.printf("%.1f\n",average);
    }
}
