package com.URISolved;

import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,sum,n1=0,n2=0;
        n = scanner.nextInt();
        for (int i =1;i<=n;i++){
            if (i==1){
                n1 = 0;
                System.out.print(n1);
            }
            else if (i==2){
                n2 = 1;
                System.out.print(n2);
            }
            else{
                sum = n1 + n2;
                System.out.print(sum);
                n1 = n2;
                n2 = sum;
            }
            if (i==n){
                System.out.println();
            }else {
                System.out.print(" ");
            }
        }
    }
}
