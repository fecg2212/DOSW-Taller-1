package edu.dosw.lab.DOSW_Taller01;

import java.util.List;

public class CarreraParalela {

    // Función combinada de máximo, mínimo y cantidad
    public static ResultadoCombinado combinarResultados(List<Integer> numeros) {
        int max = numeros.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        int min = numeros.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
        int cantidad = numeros.size();
        return new ResultadoCombinado(max, min, cantidad);
    }
    
    public static class ResultadoCombinado {
        public int maximo;
        public int minimo;
        public int cantidad;

        public ResultadoCombinado(int maximo, int minimo, int cantidad) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
        }
    }
}




