package com.URISolved;

import java.util.Scanner;

public class ArrayFillii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t,i,j=0,k;
        t = scanner.nextInt();
        for (i =0;i<1000;i++){
            System.out.printf("N[%d] = %d\n",i,j);
            j++;
            if (t==j)
                j =0;
        }
    }
}
