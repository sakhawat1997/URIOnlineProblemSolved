package com.URISolved;

import java.util.Scanner;

public class ConsecutiveOddNumber {
    public static void main(String[] args) {
        int n, x,y;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i =1;i<=n;i++){
            int totalodd = 0;
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x>y){
                for (int j= x-1;j>y;j--){
                    if (j%2!=0){
                        totalodd = totalodd+j;
                    }
                }
            }else if (x<y){
                for (int j = x+1;j<y;j++){
                    if (j%2!=0){
                        totalodd = totalodd+j;
                    }
                }
            }else {
                totalodd =0;
            }
            System.out.println(totalodd);
        }
    }
}
