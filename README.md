# DOSW - Taller 01

## Hackathon Express 2025-2

## Parte 2

- Creamos el repositorio remoto y lo configuramos localmente también para empezar a crear
las ramas necesarias para realizar los 6 retos con el
comando 'git checkout nombre_rama'

![RAMAS](docs/img.png)

## Reto #1: La bienvenida
Definimos un objeto estudiante con atributos básicos: nombre, edad, correo y semestre.
- Creamos un constructor para inicializar esos atributos.
- Tiene getters para acceder a ellos desde otras clases.

Tiene un método generarMensaje(List) que:
- Recibe una lista de estudiantes.
- Crea un mensaje de bienvenida combinando los nombres, edades, semestres y correos delos estudiantes.
- Devuelve el mensaje completo como un String.

Por último usamos el comando 'mvn clean spring-boot:run' para compilarlo con maven dándonos la salida esperada

![SALIDA](docs/img_1.png)

## Reto #2: Carrera en Paralelo

**Estudiante A:** Cambiamos el nombre de Application para el reto 2 a CarreraParalela.java
y luego creamos las subramas desde el feature del reto 2

![img.png](img.png)

![img_1.png](img_1.png)

Y por último realizamos el commit inicial con la estructura base

![img_2.png](img_2.png)

**Estudiante B:** Arrancamos actualizando nuestro carril con los cambios subidos en el feature

![img_3.png](img_3.png)

Y se realiza la función

![img_4.png](img_4.png)

**Estudiante A:** Actualizamos nuestro carril con los cambios del estudiante A y realizamos la función
para calcular el número más pequeño de un listado de números ingresados

![img_5.png](img_5.png)

Y realizamos el commit correspondiente

![img_6.png](img_6.png)

### **El primer choque** 
Al intentar mezclar los cambios de la otra rama ocurre un conflicto que toca resolver

![img_8.png](img_8.png)

Y para eso decidimos crear una función que combine los resultados

![img_7.png](img_7.png)

Y realizamos el commit

![img_9.png](img_9.png)

### **Segunda vuelta**

**Carril 1:** Añadimos la función de la verificación de si el numero
mayor es multiplo de 2.

![img_10.png](img_10.png)

**Carril 2:** Y añadimos la función que verifica si el numero mayor
es divisor de 2.

![img_11.png](img_11.png)

Y hacemos el commit 

![img_12.png](img_12.png)

### **Tercer choque**

**Carril 1:** Calculamos si la cantidad de datos de la lista es par

Añadimos los nuevos atributos y los implementamos en el constructor

![img_14.png](img_14.png)

**Carril 2:** Calculamos si la cantidad de datos es impar

También añadimos los nuevos atributos y modificamos el constructor

![img_13.png](img_13.png)

### **La gran meta**



