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
        public String maxMultiplo2; // Carril 1
        public String maxDivisor2;  // Carril 2

        public String cantidadPar;   // Carril 1
        public String cantidadImpar; // Carril 2

        public ResultadoCombinado(int maximo, int minimo, int cantidad) {
            this.maximo = maximo;
            this.minimo = minimo;
            this.cantidad = cantidad;
            this.maxMultiplo2 = null;                                // Carril 1
            this.maxDivisor2 = (2 % maximo == 0) ? "Sí" : "No";      // Carril 2
            this.cantidadPar = null;                                  // Carril 1
            this.cantidadImpar = (cantidad % 2 != 0) ? "Sí" : "No";  // Carril 2
        }
    }
}

