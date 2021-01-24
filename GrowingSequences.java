package com.URISolved;

import java.util.Scanner;

public class GrowingSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x,i;
            x = scanner.nextInt();
            if (x==0)
                break;
            for (i =1;i<=x;i++){
                System.out.printf("%d",i);
                if (i!=x)
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
}
