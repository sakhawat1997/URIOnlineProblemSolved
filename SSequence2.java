package com.URISolved;

public class SSequence2 {
    public static void main(String[] args) {
        double sum =0.0,sum2=0.0,total;
        int count =1;
        for (double i=1.0;i<=39;i+=2){
            if (i==1){
                sum = sum + i;
            }else {
                count *=2;
               sum2 = sum2 + (i/count);
            }
        }
        total = sum+sum2;
        System.out.printf("%.2f\n",total);
    }
}
