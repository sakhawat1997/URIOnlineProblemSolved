package com.URISolved;

import java.util.Scanner;

public class SequenceNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, M, N, x = 0, c;
        for(i = 0;i < 100;i++)
        {
            M = scanner.nextInt();
            N = scanner.nextInt();
            if(M <= 0 || N <= 0)
                break;
            if(M > N) {
                c = M;
                M = N;
                N = c;
            }
            for(j = M;j <= N;j++){
                System.out.printf("%d ", j);
                x = x + j;
            }
            System.out.printf("Sum=%d\n", x);
            x = 0;
        }
    }
}
