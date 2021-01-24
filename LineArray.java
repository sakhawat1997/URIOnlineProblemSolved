package com.URISolved;

import java.util.Scanner;

public class LineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line;
        String operator;
        double sum=0.0,avg;
        line = scanner.nextInt();
        double [][] m = new double[12][12];
        operator = scanner.next().toUpperCase();
        for (int i =0;i<12;i++){
            for (int j =0;j<12;j++){
                if (line == i){
                    m[i][j] = scanner.nextDouble();
                    sum = sum + m[i][j];
                }
            }
        }
        if (operator=="S"){
            System.out.printf("%.1f\n",sum);
        }else
            System.out.printf("%.1f\n",sum/m.length);
    }
}
