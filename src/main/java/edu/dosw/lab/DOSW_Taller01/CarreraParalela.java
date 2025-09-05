package edu.dosw.lab.DOSW_Taller01;

import java.util.List;

public class CarreraParalela {

    public static ResultadoMinimo obtenerMinimoYCantidad(List<Integer> numeros) {
        int min = numeros.stream()
                .min(Integer::compare)
                .orElse(Integer.MAX_VALUE);
        int cantidad = numeros.size();
        return new ResultadoMinimo(min, cantidad);
    }
    
    public static class ResultadoMinimo {
        public int minimo;
        public int cantidad;

        public ResultadoMinimo(int minimo, int cantidad) {
            this.minimo = minimo;
            this.cantidad = cantidad;
        }
    }
}



