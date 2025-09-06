package edu.dosw.lab.DOSW_Taller01;

import java.util.Set;
import java.util.TreeSet;

public class ArenaUnida {
    /**
     * Une dos colecciones de números en una sola estructura ordenada (TreeSet), eliminando duplicados.
     * Imprime los resultados usando stream() y lambda.
     * @param setA Colección A (HashSet)
     * @param setB Colección B (TreeSet)
     */
    public static void unirYMostrar(Set<Integer> setA, Set<Integer> setB) {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(setA);
        union.addAll(setB);
        union.stream()
            .forEach(n -> System.out.println("Número en arena: " + n));
    }
}
