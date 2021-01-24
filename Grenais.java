package com.URISolved;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,n,inter=0,gremio=0,draw=0;
        while (true){
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a>b){
                inter++;
            }else if (a<b){
                gremio++;
            }else if (a==b){
                draw++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            while (true){
                n = scanner.nextInt();
                if (n==1){
                    break;
                }
                if (n==2){
                    System.out.println(inter+gremio+draw+" grenais");
                    System.out.println("Inter:"+inter);
                    System.out.println("Gremio:"+gremio);
                    System.out.println("Empates:"+draw);
                    System.out.println("Inter venceu mais");
                    return;
                }
            }
        }
    }
}
