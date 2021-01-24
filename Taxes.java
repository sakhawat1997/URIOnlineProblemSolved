package com.URISolved;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxAmmount, salary,taxAbbleAmount,tax1, tax2,tax3;
        salary = scanner.nextDouble();
        if (salary <= 2000){
            System.out.println("Isento");
        }
        if (2000.01 < salary  && salary <= 3000.00){
            taxAbbleAmount = salary - 2000.00;
                taxAmmount = 0.08 * taxAbbleAmount;
                System.out.printf("R$ %.2f",taxAmmount);
        }
        if (3000.01 < salary  && salary <= 4500.00){
            taxAbbleAmount = salary - 2000.00;
            tax1 = taxAbbleAmount - 1000;
            taxAmmount =(0.08 * 1000)+ (0.18 * tax1);
            System.out.printf("R$ %.2f",taxAmmount);
        }
        if ( salary > 4500.00){
            taxAbbleAmount = salary - 2000.00;
            tax1 = taxAbbleAmount - 1000;
            tax2 = tax1 - 1500;
            taxAmmount = (0.08 * 1000)+(0.18*1500)+(0.28*tax2);
            System.out.printf("R$ %.2f",taxAmmount);
        }
    }
}
