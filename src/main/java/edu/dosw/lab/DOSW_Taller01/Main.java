package edu.dosw.lab.DOSW_Taller01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> todasListas = new ArrayList<>();

        System.out.println("¿Cuántas listas quieres ingresar?");
        int cantidadListas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadListas; i++) {
            System.out.println("Ingresa los números de la lista " + (i + 1) + " separados por espacios:");
            String linea = scanner.nextLine();
            String[] numerosStr = linea.split("\\s+");
            List<Integer> lista = new ArrayList<>();
            for (String numStr : numerosStr) {
                lista.add(Integer.parseInt(numStr));
            }
            todasListas.add(lista);
        }

        for (int i = 0; i < todasListas.size(); i++) {
            List<Integer> lista = todasListas.get(i);
            CarreraParalela.ResultadoCombinado r = CarreraParalela.combinarResultados(lista);

            System.out.println("\nResultados Lista " + (i + 1) + ":");
            System.out.println("Max: " + r.maximo);
            System.out.println("Min: " + r.minimo);
            System.out.println("Cantidad: " + r.cantidad);
            System.out.println("Max múltiplo de 2: " + r.maxMultiplo2);
            System.out.println("Max divisor de 2: " + r.maxDivisor2);
            System.out.println("Cantidad par: " + r.cantidadPar);
            System.out.println("Cantidad impar: " + r.cantidadImpar);
        }

        scanner.close();
    }
}
