package com.URISolved;

import java.util.Scanner;

public class SumConsecutiveOddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x,y,sum =0,count =0;
        n = scanner.nextInt();
        for (int i =1;i<=n;i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            for (int j=1;j>0 ;j++){
                if (x%2!=0){
                    count++;
                    sum = sum + x;
                    x++;
                    if (count==y)
                        break;
                }else {
                    x++;
                }
            }
            System.out.println(sum);
            sum =0;
            x =0;
            count=0;
        }
    }
}
