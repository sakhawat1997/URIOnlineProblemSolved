package com.URISolved;

import java.util.Scanner;

public class AnimalExm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value1, value2,value3;
        value1 = scanner.nextLine().toLowerCase();
        value2 = scanner.nextLine().toLowerCase();
        value3 = scanner.nextLine().toLowerCase();

        if (value1.equals("vertebrado") && value2.equals("ave") && value3.equals("carnivoro")){
            System.out.println("aguia");
        }
        if (value1.equals("vertebrado") && value2.equals("ave") && value3.equals("onivoro")){
            System.out.println("pomba");
        }
        if (value1.equals("vertebrado") && value2.equals("mamifero") && value3.equals("onivoro")){
            System.out.println("homem");
        }
        if (value1.equals("vertebrado") && value2.equals("mamifero") && value3.equals("herbivoro")){
            System.out.println("vaca");
        }
        if (value1.equals("invertebrado")){
            if (value2.equals("inseto")){
                if (value3.equals("hematofago")){
                    System.out.println("pulga");
                }
                if (value3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }
            if (value2.equals("anelideo")){
                if (value3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                if (value3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
