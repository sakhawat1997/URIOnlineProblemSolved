package com.URISolved;

public class SSequenceExp {
    public static void main(String[] args) {
        double s=0;
        for (int i =1;i<=100;i++){
            s = s + 1.0/i;
        }
        System.out.printf("%.2f",s);
    }
}
