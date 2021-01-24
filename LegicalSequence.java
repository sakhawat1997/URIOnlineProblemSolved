package com.URISolved;

import java.util.Scanner;

public class LegicalSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=2; j++)
            {
                if(j==1)
                    System.out.print(i+" "+i*i+" "+ i*i*i+"\n");
                else
                    System.out.print(i+" "+((i*i)+1)+" "+ ((i*i*i)+1)+"\n");
            }
        }
    }
}
