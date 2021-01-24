package com.URISolved;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary, newSalary,increment;
        salary = scanner.nextDouble();
        if (salary>=0.00 && 400.00 >=salary){
            increment = 0.15 *salary;
            newSalary = increment + salary;
            System.out.printf("Novo salario: %.2f\n",newSalary);
            System.out.printf("Reajuste ganho: %.2f\n",increment);
            System.out.println("Em percentual: 15 %");
        }
        if (salary>=400.01 && 800.00 >=salary){
            increment = 0.12 *salary;
            newSalary = increment + salary;
            System.out.printf("Novo salario: %.2f\n",newSalary);
            System.out.printf("Reajuste ganho: %.2f\n",increment);
            System.out.println("Em percentual: 12 %");
        }
        if (salary>=800.01 && 1200.00 >=salary){
            increment = 0.10 *salary;
            newSalary = increment + salary;
            System.out.printf("Novo salario: %.2f\n",newSalary);
            System.out.printf("Reajuste ganho: %.2f\n",increment);
            System.out.println("Em percentual: 10 %");
        }
        if (salary>=1200.01 && 2000.00 >=salary){
            increment = 0.07 *salary;
            newSalary = increment + salary;
            System.out.printf("Novo salario: %.2f\n",newSalary);
            System.out.printf("Reajuste ganho: %.2f\n",increment);
            System.out.println("Em percentual: 7 %");
        }
        if (2000.00 < salary){
            increment = 0.04 *salary;
            newSalary = increment + salary;
            System.out.printf("Novo salario: %.2f\n",newSalary);
            System.out.printf("Reajuste ganho: %.2f\n",increment);
            System.out.println("Em percentual: 4 %");
        }

    }
}
