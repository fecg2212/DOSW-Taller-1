package edu.dosw.lab.DOSW_Taller01;

import java.util.Hashtable;
import java.util.List;
import java.util.AbstractMap;

public class MapaHashtable {
    // Método para crear Hashtable ignorando claves duplicadas (conserva el primer valor)
    /**
     * Crea un Hashtable a partir de una lista de pares clave-valor, ignorando claves duplicadas.
     * Si una clave aparece más de una vez, se conserva el primer valor encontrado.
     * @param lista Lista de pares clave-valor (String, Integer)
     * @return Hashtable con las claves y valores únicos
     */
    public static Hashtable<String, Integer> crearHashtable(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        Hashtable<String, Integer> table = new Hashtable<>();
        for (AbstractMap.SimpleEntry<String, Integer> entry : lista) {
            table.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return table;
    }
}
