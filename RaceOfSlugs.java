package com.URISolved;

import java.util.Scanner;

public class RaceOfSlugs {
    public static void main(String[] args) {
        int c,d,maz=0;
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        while (scanner.hasNext()){
            for (int i=1;i<=c;i++){
                d = scanner.nextInt();
                if (d>maz)
                    maz =d;
            }
            if (maz<10)
                System.out.println(1);
            else if (maz<20)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}
