package com.URISolved;

import java.util.Scanner;

public class TypeOfFuel {
    public static void main(String[] args) {
        int value,alcohol=0,gasoline=0,diesel =0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            value = scanner.nextInt();
            if (value==1){
                alcohol++;
            }
            if (value==2){
                gasoline++;
            }
            if (value==3){
                diesel++;
            }
            if (value==4){
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: "+alcohol);
                System.out.println("Gasolina: "+gasoline);
                System.out.println("Diesel: "+diesel);
                return;
            }
        }
    }
}
