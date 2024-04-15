package org.example;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, 5, 8, 34, 5};
        int[] B = {8, 51, 2, 16, 5};
        int[] C = new int[5];

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(C[i]);
            if (i != 4) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
