package edu.dosw.lab.DOSW_Taller01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	// Reto #5: Batalla de Conjuntos
	java.util.List<Integer> listaHash = java.util.Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5);
	java.util.List<Integer> listaTree = java.util.Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4);

	java.util.HashSet<Integer> hashSet = ArenaHashSet.almacenarYFiltrar(listaHash);
	java.util.TreeSet<Integer> treeSet = ArenaTreeSet.almacenarYFiltrar(listaTree);

	System.out.println("--- Unión de conjuntos en la arena ---");
	ArenaUnida.unirYMostrar(hashSet, treeSet);
	}

}
