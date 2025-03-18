package part1.ejercicio5;

import java.util.Scanner;

public class PrincipalPoligono {

	// Creamos el Scanner como static para poder usarlo en todas las funciones de la
	// clase que lo necesitemos.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creamos la variable opc como int para almacenar la opción introducida por el
		// usuario.
		int opc;

		// Declaramos un objeto de tipo Rectangulo para almacenar un rectangulo de forma
		// temporal.
		Rectangulo rectangulo;

		// Declaramos un objeto de tipo Triangulo para almacenar un triangulo de forma
		// temporal.
		Triangulo triangulo;

		do {
			// Llamamos a la función menu y leemos la opción seleccionada.
			menu();
			opc = sc.nextInt();

			switch (opc) {
			case 1 -> {
				// Almacenamos en el objeto triangulo el objeto creado que nos devuelve la
				// función crearTriangulo.
				triangulo = crearTriangulo();

				// Comprobamos si la función añadirPoligono ha añadido a nuestro triangulo, si
				// es así mostramos un mensaje de que si se ha podido añadir.
				if (CrudPoligono.añadirPoligono(triangulo)) {
					System.out.println("El triangulo es añadido correctamente");

					// Si no mostramos un mensaje de que no se ha podido.
				} else {
					System.out.println("El triangulo no se ha añadido.");
				}
			}
			
			case 2 -> {
				// Almacenamos en el objeto rectangulo el objeto creado que nos devuelve la
				// función crearRectangulo.
				rectangulo = crearRectangulo();

				// Comprobamos si la función añadirPoligono ha añadido a nuestro rectangulo, si
				// es así mostramos un mensaje de que si se ha podido añadir.
				if (CrudPoligono.añadirPoligono(rectangulo)) {
					System.out.println("El rectangulo es añadido correctamente");

					// Si no mostramos un mensaje de que no se ha podido.
				} else {
					System.out.println("El rectangulo no se ha añadido.");
				}
			}
			
			case 3 -> {
				// Llamamos a la función listarPoligonos para mostrar todos los poligonos
				// añadidos al conjunto.
				CrudPoligono.listarPoligonos();
			}
			
			case 4 -> {
				System.out.println("Saliendo...");
			}
			
			default -> {
				System.out.println("La opción introducida no es valida.");
			}
			}

			// Mientras la opción sea distinta de 4 seguiremos ejecutando el menú.
		} while (opc != 4);
	}

	/**
	 * Esta función se encarga de imprimir el menú.
	 */
	public static void menu() {
		System.out.println("MENU");
		System.out.println("1. Introducir triángulo");
		System.out.println("2. Introducir rectángulo");
		System.out.println("3. Mostrar polígonos");
		System.out.println("4. Salir");
		System.out.println();
		System.out.print("Introduce una opción: ");
	}

	/**
	 * Esta función se encarga de crear un objeto de tipo rectangulo con la
	 * información solicitada al usuario.
	 * 
	 * @return EL objeto de tipo rectangulo.
	 */
	public static Rectangulo crearRectangulo() {
		// Declaramos un objeto Rectangulo que sera el que devolveremos.
		Rectangulo rect;

		// Creamos la variable lado1 como int para almacenar el primer lado.
		double lado1;

		// Creamos la variable lado2 como int para almacenar el segundo lado.
		double lado2;

		// Llamamos a la función pedirLado1 para que nos devuelva el valor del lado 1.
		lado1 = pedirLado1();

		// Llamamos a la función pedirLado2 para que nos devuelva el valor del lado 2.
		lado2 = pedirLado2();

		// Creamos un objeto rectangulo con la información solicitada al usuario.
		rect = new Rectangulo(lado1, lado2);

		// Devolvemos el nuevo rectangulo.
		return rect;
	}

	/**
	 * Esta función se encarga de crear un objeto de tipo triangulo con la
	 * información solicitada al usuario.
	 * 
	 * @return El objeto de tipo triangulo.
	 */
	public static Triangulo crearTriangulo() {
		// Declaramos un objeto Triangulo que sera el que devolveremos.
		Triangulo triangulo;

		// Creamos la variable lado1 como int para almacenar el primer lado.
		double lado1;

		// Creamos la variable lado2 como int para almacenar el segundo lado.
		double lado2;

		// Creamos la variable lado3 como int para almacenar el tercer lado.
		double lado3;

		// Llamamos a la función pedirLado1 para que nos devuelva el valor del lado 1.
		lado1 = pedirLado1();

		// Llamamos a la función pedirLado2 para que nos devuelva el valor del lado 2.
		lado2 = pedirLado2();

		// Llamamos a la función pedirLado3 para que nos devuelva el valor del lado 3.
		lado3 = pedirLado3();

		// Creamos un objeto triangulo con la información solicitada al usuario.
		triangulo = new Triangulo(lado1, lado2, lado3);

		// Devolvemos el nuevo rectangulo.
		return triangulo;

	}

	/**
	 * Esta función se encarga de pedir al usuario el lado 1 de un poligono.
	 * 
	 * @return El lado 1
	 */
	public static double pedirLado1() {
		// Creamos la variable lado1 como int para almacenar el primer lado.
		double lado1;

		// Le pedimos al usuario que introduzca el lado 1 y lo leemos.
		System.out.println("Introduce el lado 1: ");
		lado1 = sc.nextDouble();

		// Devolvemos el lado 1.
		return lado1;
	}

	/**
	 * Esta función se encarga de pedir al usuario el lado 2 de un poligono.
	 * 
	 * @return El lado 2
	 */
	public static double pedirLado2() {
		// Creamos la variable lado2 como int para almacenar el segundo lado.
		double lado2;

		// Le pedimos al usuario que introduzca el lado 2 y lo leemos.
		System.out.println("Introduce el lado 2: ");
		lado2 = sc.nextDouble();

		// Devolvemos el lado 2.
		return lado2;
	}

	/**
	 * Esta función se encarga de pedir al usuario el lado 3 de un poligono.
	 * 
	 * @return El lado 3
	 */
	public static double pedirLado3() {
		// Creamos la variable lado3 como int para almacenar el tercer lado.
		double lado3;

		// Le pedimos al usuario que introzca el lado 3 y lo leemos.
		System.out.println("Introduce el lado 3: ");
		lado3 = sc.nextDouble();

		// Devolvemos el lado 3.
		return lado3;
	}

}
