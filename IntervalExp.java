package com.URISolved;

import java.util.Scanner;

public class IntervalExp {
    public static void main(String[] args) {
        int n, x,in=0,out=0,start,end;
        start = 10;
        end = 20;
        Scanner scanner = new Scanner(System.in);
        n =scanner.nextInt();
        for (int i=1;i<=n;i++){
            x = scanner.nextInt();
            if (x>= start && x<= end){
                in = in+1;
            }else {
                out = out+1;
            }
        }
        System.out.print(in+" in\n"+out+" out\n");
    }
}
