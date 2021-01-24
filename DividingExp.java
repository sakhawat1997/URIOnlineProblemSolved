package com.URISolved;

import java.util.Scanner;

public class DividingExp {
    public static void main(String[] args) {
        int n;
        double x,y;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
           x = scanner.nextInt();
           y = scanner.nextInt();
           if (y==0){
               System.out.println("divisao impossivel");
           }else
            System.out.printf("%.1f\n",x/y);
        }
    }
}
