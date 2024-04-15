import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ListsTest {

    @Test
    public void ListasComMesmoComprimento_ResultadoCorreto() {
        int[] A = {2, 5, 8, 34, 5};
        int[] B = {8, 51, 2, 16, 5};
        Object result = Lists.calcularLista(A, B);
        assertEquals(new ArrayList<>(Arrays.asList(10, 56, 10, 50, 10)), result);
    }

    @Test
    public void ListasComComprimentosDiferentes_Erro() {
        int[] A = {2, 5, 8, 34, 5};
        int[] B = {8, 51, 2, 16};
        Object result = Lists.calcularLista(A, B);
        assertEquals("Erro: as listas A e B devem ter o mesmo comprimento", result);
    }

    @Test
    public void ListasComInteirosNegativos_ResultadoCorreto() {
        int[] A = {-2, -5, -8, -34, -5};
        int[] B = {-8, -51, -2, -16, -5};
        Object result = Lists.calcularLista(A, B);
        assertEquals(new ArrayList<>(Arrays.asList(-10, -56, -10, -50, -10)), result);
    }

    @Test
    public void ListasComInteirosPositivosENegativos_ResultadoCorreto() {
        int[] A = {2, -5, 8, -34, 5};
        int[] B = {-8, 51, -2, 16, -5};
        Object result = Lists.calcularLista(A, B);
        assertEquals(new ArrayList<>(Arrays.asList(-6, 46, 6, -18, 0)), result);
    }

    @Test
    public void ListasComTodosOsZeros_ResultadoCorreto() {
        int[] A = {0, 0, 0, 0, 0};
        int[] B = {0, 0, 0, 0, 0};
        Object result = Lists.calcularLista(A, B);
        assertEquals(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)), result);
    }
}
