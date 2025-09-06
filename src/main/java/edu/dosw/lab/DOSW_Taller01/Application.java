package edu.dosw.lab.DOSW_Taller01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Ejemplo de uso para el reto
		java.util.List<java.util.AbstractMap.SimpleEntry<String, Integer>> listaHash = java.util.Arrays.asList(
			new java.util.AbstractMap.SimpleEntry<>("oro", 5),
			new java.util.AbstractMap.SimpleEntry<>("plata", 3),
			new java.util.AbstractMap.SimpleEntry<>("oro", 7),
			new java.util.AbstractMap.SimpleEntry<>("diamante", 10)
		);
		java.util.List<java.util.AbstractMap.SimpleEntry<String, Integer>> listaTable = java.util.Arrays.asList(
			new java.util.AbstractMap.SimpleEntry<>("plata", 8),
			new java.util.AbstractMap.SimpleEntry<>("rubí", 4),
			new java.util.AbstractMap.SimpleEntry<>("oro", 12),
			new java.util.AbstractMap.SimpleEntry<>("esmeralda", 6)
		);

		java.util.HashMap<String, Integer> hashMap = MapaHash.crearHashMap(listaHash);
		java.util.Hashtable<String, Integer> hashTable = MapaHashtable.crearHashtable(listaTable);
		System.out.println("--- Resultado combinado ---");
		MapaCombinado.combinarYImprimir(hashMap, hashTable);
	}

}
