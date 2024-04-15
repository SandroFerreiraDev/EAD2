package org.example;
import java.util.ArrayList;

public class Lists {
    public static Object calcularLista(int[] A, int[] B) {
        if (A.length != B.length) {
            return "Erro: as listas A e B devem ter o mesmo comprimento";
        }

        ArrayList<Integer> C = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            C.add(A[i] + B[i]);
        }

        return C;
    }
}
