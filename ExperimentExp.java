package com.URISolved;

import java.util.Scanner;

public class ExperimentExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i,total =0,quantity,rat=0,frog=0, rabbit=0;
        float avgrabbit,avgrat,avgfrog;
        String animal;
        n = scanner.nextInt();
        for (i =1;i<=n;i++){
            quantity = scanner.nextInt();
            animal = scanner.next().toUpperCase();
            if (animal.equals("C")){
                rabbit = rabbit + quantity;
            }
            if (animal.equals("R")){
                rat = rat + quantity;
            }
            if (animal.equals("S")){
                frog = frog + quantity;
            }
            total = total + quantity;
        }
        System.out.printf("Total: %d cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",rabbit);
        System.out.printf("Total de ratos: %d\n",rat);
        System.out.printf("Total de sapos: %d\n",frog);
        avgrabbit = (float) (rabbit * 100/92);
        avgrat =(float) (rat * 100/92);
        avgfrog =(float) (frog * 100/92);
        System.out.printf("Percentual de coelhos: %.2f %%\n",avgrabbit);
        System.out.printf("Percentual de coelhos: %.2f %%\n",avgrat);
        System.out.printf("Percentual de coelhos: %.2f %%\n",avgfrog);
    }
}
