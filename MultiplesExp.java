package com.URISolved;

import java.util.Scanner;

public class MultiplesExp {
    public static void main(String[] args) {
        int x,y,sum=0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (x>y){
            for (int i=y;i<=x;i++){
                if (i%13!=0){
                    sum = sum +i;
                }
            }
            System.out.println(sum);
        }
        else if (x<y){
            for (int j =x;j<=y;j++){
                if (j%13!=0){
                    sum = sum +j;
                }
            }
            System.out.println(sum);
        }
    }
}
