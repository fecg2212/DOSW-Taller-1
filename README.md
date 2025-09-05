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

![img.png](docs/img16.png)

![img_1.png](docs/img17.png)

Y por último realizamos el commit inicial con la estructura base

![img_2.png](docs/img_2.png)

**Estudiante B:** Arrancamos actualizando nuestro carril con los cambios subidos en el feature

![img_3.png](docs/img_3.png)

Y se realiza la función

![img_4.png](docs/img_4.png)

**Estudiante A:** Actualizamos nuestro carril con los cambios del estudiante A y realizamos la función
para calcular el número más pequeño de un listado de números ingresados

![img_5.png](docs/img_5.png)

Y realizamos el commit correspondiente

![img_6.png](docs/img_6.png)

### **El primer choque** 
Al intentar mezclar los cambios de la otra rama ocurre un conflicto que toca resolver

![img_8.png](docs/img_8.png)

Y para eso decidimos crear una función que combine los resultados

![img_7.png](docs/img_7.png)

Y realizamos el commit

![img_9.png](docs/img_9.png)

### **Segunda vuelta**

**Carril 1:** Añadimos la función de la verificación de si el numero
mayor es multiplo de 2.

![img_10.png](docs/img_10.png)

**Carril 2:** Y añadimos la función que verifica si el numero mayor
es divisor de 2.

![img_11.png](docs/img_11.png)

Y hacemos el commit 

![img_12.png](docs/img_12.png)

### **Tercer choque**

**Carril 1:** Calculamos si la cantidad de datos de la lista es par

Añadimos los nuevos atributos y los implementamos en el constructor

![img_14.png](docs/img_14.png)

**Carril 2:** Calculamos si la cantidad de datos es impar

También añadimos los nuevos atributos y modificamos el constructor

![img_13.png](docs/img_13.png)

### **La gran meta**

Ahora empezamos a fusionar los 2 carriles al feature del reto
y probamos el código para ver si sí se implementó bien.

![img_15.png](docs/img_15.png)


