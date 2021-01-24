package com.URISolved;

import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t,pa,pb,count =0;
        double g1,g2;
        t = scanner.nextInt();
        for (int i=1;i<=t;i++){
            pa = scanner.nextInt();
            pb = scanner.nextInt();
            g1 = scanner.nextDouble();
            g2 = scanner.nextDouble();

            while (pa<=pb){
                pa *= (g1 /100.0) +1.0;
                pb *= (g2/100) + 1.0;
                count++;
                if (count>100){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (count<=100)
                System.out.printf("%d anos.\n",count);
            count =0;
        }
    }
}
