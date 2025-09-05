package edu.dosw.lab.DOSW_Taller01;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EcoMisterioso {

    // Función combinada: repetir 3 veces y luego invertir
    public static String ecoCombinado(String mensaje) {
        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .collect(Collectors.joining(" "));

        return new StringBuffer(repetido).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, String> eco = EcoMisterioso::ecoCombinado;

        System.out.println("Escribe un mensaje y presiona Enter (vacío para salir):");
        while (true) {
            System.out.print("> ");
            String mensaje = scanner.nextLine();

            if (mensaje.isEmpty()) break;

            String resultado = eco.apply(mensaje);
            System.out.println("Eco: " + resultado);
        }

        System.out.println("¡Fin del eco misterioso!");
        scanner.close();
    }
}



