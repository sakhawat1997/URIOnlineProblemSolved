package com.URISolved;

import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass, password = 2002;
        for (int i =1; i>0;i++){
            pass = scanner.nextInt();
            if (password != pass){
                System.out.println("Senha Invalida");
            }else {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
