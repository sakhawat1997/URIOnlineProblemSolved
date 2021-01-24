package com.URISolved;

import java.util.Scanner;

public class PumExp {
    public static void main(String[] args) {
        int N;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();

        for (int i = 1; i <= (4*N - 1); i+=4) {

            for (int j = i; j <= i+2; j++) {

                System.out.print(j+" ");

            }

            System.out.print("PUM\n");

        }
    }
}
