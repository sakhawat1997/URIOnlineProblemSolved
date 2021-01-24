package com.URISolved;

import java.util.Scanner;

public class BobConduit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line,value1,value2,sum;
        line = scanner.nextInt();
        for (int i =0;i<line;i++){
            value1 = scanner.nextInt();
            value2 = scanner.nextInt();
            sum = value1+value2;
            System.out.println(sum);
        }
    }
}
