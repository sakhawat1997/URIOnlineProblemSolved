package com.URISolved;
import java.util.Scanner;

public class JopeshFamous {
    int flavious(int x, int y){
        if(x == 1)
            return 0;
        return (flavious(x-1,y)+y)%x;
    }
    public static int remaining(int n, int k) {
        int r = 0;
        for (int i = 2; i <= n; i++)
            r = (r + k) % i;
        return r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n, x, y;
            n = scanner.nextInt();
            for(int i = 0; i < n; i++){
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.printf("Case %d: %d\n",i+1,remaining(x,y)+1);
        }
    }
}
