package com.URISolved;

import java.util.Scanner;

public class LowestNumberPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d,e,N, p=0, min;
        N = scanner.nextInt();
        int X [] = new int [N];
        for(a=0; a<N; a++)
           X[a] = scanner.nextInt();
        min=X[0];
        for(a=1; a<N; a++)
        {
            if(min>X[a])
            {
                min=X[a];
                p=a;
            }
        }
        System.out.printf("Menor valor: %d\nPosicao: %d\n", min, p);
    }
}
