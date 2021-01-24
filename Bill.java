package com.URISolved;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s,value;
        s = scanner.nextInt();
        for (int i =1;i<=s;i++){
            value = scanner.nextInt();
            if (value%2==0)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
