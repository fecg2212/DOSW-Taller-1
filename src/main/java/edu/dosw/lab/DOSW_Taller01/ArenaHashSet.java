package edu.dosw.lab.DOSW_Taller01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArenaHashSet {
    /**
     * Almacena números en un HashSet y elimina los múltiplos de 3.
     * Utiliza removeIf y lambda para filtrar los elementos.
     * @param numeros Lista de números a almacenar
     * @return HashSet sin múltiplos de 3
     */
    public static HashSet<Integer> almacenarYFiltrar(List<Integer> numeros) {
        HashSet<Integer> set = new HashSet<>(numeros);
        set.removeIf(n -> n % 3 == 0);
        return set;
    }
}
