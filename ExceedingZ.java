package com.URISolved;

import java.util.Scanner;

public class ExceedingZ {
    public static void main(String[] args) {
        int x,z,sum=0,count=0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        z = scanner.nextInt();
        while (z<=x){
            z = scanner.nextInt();
        }
        for (int i=x; ;i++){
            sum = sum + i;
            count++;
            if (sum>z)
                break;
        }
        System.out.println(count);
    }
}
