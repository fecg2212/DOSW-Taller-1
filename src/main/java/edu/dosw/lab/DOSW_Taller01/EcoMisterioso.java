package edu.dosw.lab.DOSW_Taller01;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EcoMisterioso {

	public static String repetirConBuilder(String mensaje) {
		return IntStream.range(0, 3)
				.mapToObj(i -> mensaje)
				.collect(Collectors.joining(" "));
	}
}

