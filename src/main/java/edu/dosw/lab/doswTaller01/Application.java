package edu.dosw.lab.doswTaller01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Estudiante e1 = new Estudiante("Felipe Calvache", 21, "felipe.calvache-g@mail.escuelaing.edu.co", 8);
		Estudiante e2 = new Estudiante("Sebastian Duque", 22, "sebastian.duque@mail.escuelaing.edu.co", 8);

		List<Estudiante> pareja = Arrays.asList(e1, e2);

		String mensaje = MensajeBienvenida.generarMensaje(pareja);
		System.out.println(mensaje);
	}
}

