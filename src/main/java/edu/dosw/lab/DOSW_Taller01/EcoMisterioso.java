package edu.dosw.lab.DOSW_Taller01;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EcoMisterioso {

    public static String ecoCombinado(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        // Invertir el resultado
        return new StringBuffer(repetido).reverse().toString();
    }
}


