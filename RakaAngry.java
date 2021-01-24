package com.URISolved;
import java.util.Scanner;
public class RakaAngry {
    public static void main(String[] args) {
        String name;
        int age;
        String email;
        int relation;
        String loverName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        System.out.print("Enter Email: ");
        email = scanner.next();
        System.out.println();
        System.out.println("Relation Status");
        System.out.println("1. Single");
        System.out.println("2. Relationship");
        relation = scanner.nextInt();
        if (relation==1){
            System.out.println("No Relation");
        }else if (relation==2){
            System.out.print("Enter BF/GF Name: ");
            loverName = scanner.next();
        }

        System.out.println("Mr/Ms Name: "+name);
        System.out.println("Mr/Ms Age: "+age);
        System.out.println("Mr/Ms Email: " + email);
        System.out.println("His/Her Name: " + loverName);

    }
}
