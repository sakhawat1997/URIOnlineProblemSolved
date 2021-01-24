package com.URISolved;

import java.util.Scanner;

public class ScoreValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conter=0;
        double value,sum =0.0;
        while (true){
            value = scanner.nextDouble();
            if (value<0 || value>10){
                System.out.println("nota invalida");
            }else {
                sum = sum + value;
                conter++;
                if (conter==2){
                    break;
                }
            }
        }
        System.out.printf("media = %.2f\n",sum/conter);
    }
}
