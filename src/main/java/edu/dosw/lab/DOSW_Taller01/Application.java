package edu.dosw.lab.DOSW_Taller01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Reto #6: La máquina de decisiones
		MaquinaDecisiones maquina = new MaquinaDecisiones();
		String[] comandos = {
			"SALUDAR", "DESPEDIR", "CANTAR", "DANZAR",
			"BROMEAR", "GRITAR", "SUSURRAR", "ANALIZAR"
		};
		System.out.println("--- Probando todos los comandos de la máquina ---");
		for (String comando : comandos) {
			maquina.ejecutarComando(comando);
		}
		// Ejemplo de comando no reconocido
		maquina.ejecutarComando("VOLAR");
	}

}
