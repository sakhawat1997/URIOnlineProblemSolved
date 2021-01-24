package com.URISolved;

import java.util.Scanner;

public class SumConsecutiveEvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,count=0,sum=0;
        while (true){
            x = scanner.nextInt();
            if (x==0)
                break;
            while (true){
                if (x%2==0){
                    sum = sum + x;
                    count++;
                    if (count==5)
                        break;
                    x++;
                }else {
                    x++;
                }
            }
            System.out.println(sum);
            sum = 0;
            x = 0;
            count =0;
        }
    }
}
