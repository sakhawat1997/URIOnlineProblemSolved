package com.URISolved;

public class SequenseExp {
    public static void main(String[] args) {

        for (int i = 1,j =7; i < 10; i += 2,j += 2) {
            for (int l = i, k = j; k >= (j-2); k--) {
                System.out.print("I="+l+" J="+k+"\n");
            }
        }
    }
}
