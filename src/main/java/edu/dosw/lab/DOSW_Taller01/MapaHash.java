package edu.dosw.lab.DOSW_Taller01;

import java.util.HashMap;
import java.util.List;
import java.util.AbstractMap;

public class MapaHash {
    // Método para crear HashMap ignorando claves duplicadas (conserva el primer valor)
    /**
     * Crea un HashMap a partir de una lista de pares clave-valor, ignorando claves duplicadas.
     * Si una clave aparece más de una vez, se conserva el primer valor encontrado.
     * @param lista Lista de pares clave-valor (String, Integer)
     * @return HashMap con las claves y valores únicos
     */
    public static HashMap<String, Integer> crearHashMap(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        HashMap<String, Integer> map = new HashMap<>();
        for (AbstractMap.SimpleEntry<String, Integer> entry : lista) {
            map.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
