package com.URISolved;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,x,counter ,value;
        n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            x = scanner.nextInt();
            if(x==2)
                System.out.printf("%d eh primo\n",x);
            else if (x==0 || x==1)
                System.out.printf("%d nao eh primo\n",x);
            else
            {
                value= (int) Math.sqrt(x);
                counter=0;
                for(int j=2;j<=value+1;j++)
                {
                    if(x%j==0)
                    {
                        counter=1;
                        break;
                    }
                }
                if(counter==1)
                    System.out.printf("%d nao eh primo\n",x);
                else
                    System.out.printf("%d eh primo\n",x);
            }
        }
    }
}
