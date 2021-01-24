package com.URISolved;

public class Sequence4 {
    public static void main(String[] args) {
        int p=0;
        double i,j;
        for(i=0.0; i<2.0; i=i+0.2)
        {
            if(p==5) p=0;
            for(j=1; j<=3; j++)
            {
                if(p==0)
                    System.out.printf("I=%.0f J=%.0f\n",i,j+i);
                else
                    System.out.printf("I=%.1f J=%.1f\n",i,j+i);
            }
            p++;
        }
    }
}
