package com.URISolved;

import java.util.Scanner;

public class SummingConsecutive {
    public static void main(String[] args) {
        int a,n,sum=0,value;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        n = scanner.nextInt();
        while (n<=0){
            n = scanner.nextInt();
        }
        while (n>0) {
           sum += a++;
           n--;
        }
        System.out.println(sum);
    }
}
