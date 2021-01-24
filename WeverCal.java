package com.URISolved;
import java.util.Scanner;
public class WeverCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  percentage;
        double total_amount,total_weber,sum_value,sumOfWeber;
        System.out.print("Total Amount: ");
        total_amount = scanner.nextDouble();
        System.out.print("Percentage % of weber: ");
        percentage = scanner.nextInt();
        total_weber = percentage/100.0;
        sumOfWeber = total_amount * total_weber;
        sum_value = total_amount - sumOfWeber;
        System.out.printf("Total Payable Amount: %.2f\n",sum_value);
    }
}
