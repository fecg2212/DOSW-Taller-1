package edu.dosw.lab.DOSW_Taller01;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa la máquina de decisiones.
 * Permite ejecutar comandos escritos que activan diferentes acciones usando switch-case y lambdas.
 * Los comandos disponibles son:
 * <ul>
 *   <li>SALUDAR: La máquina dice un saludo especial.</li>
 *   <li>DESPEDIR: La máquina se despide.</li>
 *   <li>CANTAR: La máquina canta en binario.</li>
 *   <li>DANZAR: La máquina gira y emite chispas.</li>
 *   <li>BROMEAR: La máquina cuenta una broma geek.</li>
 *   <li>GRITAR: La máquina grita una alerta.</li>
 *   <li>SUSURRAR: La máquina susurra sobre bugs.</li>
 *   <li>ANALIZAR: La máquina analiza y motiva al programador.</li>
 * </ul>
 * El método ejecutarComando permite activar cualquier comando disponible.
 */
public class MaquinaDecisiones {
    private final Map<String, Runnable> comandos;

    public MaquinaDecisiones() {
        comandos = new HashMap<>();
        inicializarComandos();
    }

     /**
      * Inicializa el mapa de comandos y acciones usando lambdas y switch-case.
      * Cada comando se vincula a una acción que se ejecuta mediante un Runnable.
      */
    private void inicializarComandos() {
        for (String comando : new String[]{
                "SALUDAR", "DESPEDIR", "CANTAR", "DANZAR",
                "BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR"
        }) {
            comandos.put(comando, () -> {
                switch (comando) {
                    case "SALUDAR":
                        System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!");
                        break;
                    case "DESPEDIR":
                        System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
                        break;
                    case "CANTAR":
                        System.out.println("La máquina canta: 01010101");
                        break;
                    case "DANZAR":
                        System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
                        break;
                    case "BROMEAR":
                        System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio...");
                        break;
                    case "GRITAR":
                        System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                        break;
                    case "SUSURRAR":
                        System.out.println("La máquina susurra: Shhh... los bugs están dormidos.");
                        break;
                    case "ANALIZAR":
                        System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!");
                        break;
                    default:
                        System.out.println("Comando desconocido.");
                }
            });
        }
    }

     /**
      * Ejecuta el comando recibido si existe en el mapa, usando la acción lambda correspondiente.
      * Si el comando no existe, muestra un mensaje de error.
      * @param comando Comando a ejecutar (String)
      */
    public void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando no reconocido: " + comando);
        }
    }
}
