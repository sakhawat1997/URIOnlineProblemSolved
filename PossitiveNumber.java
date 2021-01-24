package com.URISolved;

import java.util.Scanner;

public class PossitiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num ;
        int i, counter =0;
        for(i=0;i<6;i++){
            num = scanner.nextDouble();
            if (num>0){
                counter++;
            }
        }
        System.out.printf("%d valores positivos\n",counter);

    }
}
