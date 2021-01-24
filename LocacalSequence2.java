package com.URISolved;

import java.util.Scanner;

public class LocacalSequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y,counter=0;
        x = scanner.nextInt();
        y = scanner.nextInt();
        for (int i = 1;i<=y;i++){
            counter ++;
            System.out.print(i);
            if (counter==x|| i==y){
                System.out.println();
                counter=0;
            }else {
                System.out.print(" ");
            }
        }
    }
}
