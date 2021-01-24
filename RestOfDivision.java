package com.URISolved;

import java.util.Scanner;

public class RestOfDivision {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (x>y){
            for (int i = y;i<x;i++){
                if (i%5==2|| i%5==3){
                    System.out.println(i);
                }
            }
        }
        else if (x<y){
            for (int j = x;j<y;j++){
                if (j%5==2|| j%5==3){
                    System.out.println(j);
                }
            }
        }
    }
}
