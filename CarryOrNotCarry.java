package com.URISolved;

import java.util.Scanner;

public class CarryOrNotCarry {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long x, y, soma;
            while (sc.hasNext()) {
                x = sc.nextLong();
                y = sc.nextLong();
                soma = x^y;
                System.out.println(soma);
            }

    }
}
