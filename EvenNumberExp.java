package com.URISolved;

import java.util.Scanner;

public class EvenNumberExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, number, counter=0;
        for (i=0;i<5;i++){
            number = scanner.nextInt();
            if (number%2==0){
                counter++;
            }
        }
        System.out.println(counter+" valores pares");
    }
}
