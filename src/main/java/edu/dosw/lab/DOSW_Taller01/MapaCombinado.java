package edu.dosw.lab.DOSW_Taller01;

import java.util.*;
import java.util.stream.Collectors;

public class MapaCombinado {
    // Combina HashMap y Hashtable, prioriza valores del Hashtable, convierte claves a mayúsculas y ordena ascendentemente antes de imprimir
        /**
         * Combina dos mapas (HashMap y Hashtable), priorizando los valores del Hashtable en caso de conflicto.
         * Convierte todas las claves a mayúsculas y las imprime ordenadas ascendentemente.
         * Utiliza stream(), map(), sorted() y Collectors.toMap().
         * @param hashMap Mapa HashMap con pares clave-valor
         * @param hashTable Mapa Hashtable con pares clave-valor
         */
        public static void combinarYImprimir(Map<String, Integer> hashMap, Map<String, Integer> hashTable) {
            Map<String, Integer> combinado = new HashMap<>(hashMap);
            for (String key : hashTable.keySet()) {
                combinado.put(key, hashTable.get(key));
            }
            // Convertir claves a mayúsculas y ordenar ascendentemente
            Map<String, Integer> resultado = combinado.entrySet().stream()
                .collect(Collectors.toMap(
                    e -> e.getKey().toUpperCase(),
                    Map.Entry::getValue,
                    (v1, v2) -> v2
                ));
            resultado.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
        }
}
