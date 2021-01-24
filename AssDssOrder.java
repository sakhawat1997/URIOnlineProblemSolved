package com.URISolved;

import java.util.Scanner;

public class AssDssOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        for (int i =1;i>0;i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x == y){
                break;
            }
            if (x>y){
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }
        }

    }
}
