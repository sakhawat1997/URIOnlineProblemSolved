package com.URISolved;

import java.util.Scanner;

public class QuadrantNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        while (true){
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x == 0 || y == 0){
                break;
            }
            if (x>0 && y>0){
                System.out.println("primeiro");
            }
            if (x>0 && y<0){
                System.out.println("quarto");
            }
            if (x<0 && y<0){
                System.out.println("terceiro");
            }
            if (x<0 && y>0){
                System.out.println("segundo");
            }
        }
    }
}
