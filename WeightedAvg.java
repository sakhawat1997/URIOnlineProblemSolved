package com.URISolved;

import java.util.Scanner;

public class WeightedAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i;
        n = scanner.nextInt();
        double value1,value2,value3,avg;
        for (i=1;i<=n;i++){
            value1 = scanner.nextDouble();
            value2 = scanner.nextDouble();
            value3 = scanner.nextDouble();
            avg = (value1*2 + value2 * 3 + value3 * 5)/10;
            System.out.printf("%.1f\n",avg);
        }
    }
}
