package edu.dosw.lab.DOSW_Taller01;

import java.util.TreeSet;
import java.util.List;

public class ArenaTreeSet {
    /**
     * Almacena números en un TreeSet (ordenados) y elimina los múltiplos de 5.
     * Utiliza removeIf y lambda para filtrar los elementos.
     * @param numeros Lista de números a almacenar
     * @return TreeSet sin múltiplos de 5
     */
    public static TreeSet<Integer> almacenarYFiltrar(List<Integer> numeros) {
        TreeSet<Integer> set = new TreeSet<>(numeros);
        set.removeIf(n -> n % 5 == 0);
        return set;
    }
}
