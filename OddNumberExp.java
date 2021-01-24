package com.URISolved;

import java.util.Scanner;

public class OddNumberExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0,counter = 0,number;
        number = scanner.nextInt();
        for (i=number;i>0;i++){
            if (i%2!=0){
                counter++;
                System.out.println(i);
                if (counter==6){
                    break;
                }
            }
        }
    }
}
