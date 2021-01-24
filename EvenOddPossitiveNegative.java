package com.URISolved;

import java.util.Scanner;

public class EvenOddPossitiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, number, poCounter =0,nCounter =0,evenCounter=0,oddCounter=0;

        for (i=0;i<5;i++){
            number = scanner.nextInt();
            if (number%2==0){
                evenCounter++;
            }
            if (number%2!=0){
                oddCounter++;
            }
            if (number>0){
                poCounter++;
            }
            if (number<0){
                nCounter++;
            }
        }
        System.out.println(evenCounter+" valor(es) par(es)");
        System.out.println(oddCounter+" valor(es) impar(es)");
        System.out.println(poCounter+" valor(es) positivo(s)");
        System.out.println(nCounter+" valor(es) negativo(s)");
    }
}
