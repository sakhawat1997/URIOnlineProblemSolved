package com.URISolved;

import java.util.Scanner;

public class ArrayFill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, p, i, b;

        int []  par= new int[5];
        int [] impar  = new int [5];

        p = 0;
        i = 0;

        for(int j = 0; j < 15; j++){
           a = scanner.nextInt();
            if(a%2 == 0){
                par[p] = a;
                p++;
            }else{
                impar[i] = a;
                i++;
            }

            if(p == 5){
                b = 0;
                while(b != 5){
                    System.out.printf("par[%d] = %d\n",b,par[b]);
                    b++;
                }
                p = 0;
            }
            if(i == 5){
                b = 0;
                while(b != 5){
                    System.out.printf("impar[%d] = %d\n",b,impar[b]);
                    b++;
                }
                i = 0;
            }
            if(j == 14){
                b = 0;
                while(b < i){
                    System.out.printf("impar[%d] = %d\n",b,impar[b]);
                b++;
                }
                b = 0;
                while(b < p){
                    System.out.printf("par[%d] = %d\n",b,par[b]);
                b++;
                }
            }
        }
    }
}
