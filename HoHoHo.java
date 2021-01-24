package com.URISolved;

import java.util.Scanner;

public class HoHoHo {
    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        for (int i =1;i<=count;i++){
            System.out.print("Ho");
            if (i==count){
                System.out.println("!");
            }else {
                System.out.print(" ");
            }
        }
    }
}
