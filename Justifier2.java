package com.URISolved;

import java.util.Scanner;

public class Justifier2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String reading;
        int n;
        while (true){
            n = scanner.nextInt();
            for (int i =1;i<=n;i++){
                reading = scanner.nextLine();
                System.out.println(reading);
            }
            if (n==0)
                break;
        }
    }
}
