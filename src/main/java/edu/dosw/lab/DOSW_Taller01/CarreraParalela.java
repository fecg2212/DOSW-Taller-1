package edu.dosw.lab.DOSW_Taller01;

import java.util.List;

public class CarreraParalela {

    public static int numeroMaximo(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compare)
                .orElse(Integer.MIN_VALUE);
    }

}


