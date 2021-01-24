package com.URISolved;

import java.util.Scanner;

public class SeveralScoreAvg {
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
                    System.out.printf("media = %.2f\n",sum/conter);
                    System.out.println("novo calculo (1-sim 2-nao)");
                    while (true){
                        value = scanner.nextInt();
                        if (value==1){
                            conter = 0;
                            sum = 0;
                            break;
                        }
                        else if (value==2){
                            return;
                        }else {
                            System.out.println("novo calculo (1-sim 2-nao)");
                        }
                    }
                }
            }
        }
    }
}
