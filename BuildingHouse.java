package com.URISolved;

import java.util.Scanner;

public class BuildingHouse {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int x;
        int y;
        int z;
        int value;
        while (true){
            x = scanner.nextInt();
            if (x==0)
                break;
            y = scanner.nextInt();
            z = scanner.nextInt();
            value = (int) Math.sqrt(x*y*100/z);
            System.out.println(value);
        }
    }
}
