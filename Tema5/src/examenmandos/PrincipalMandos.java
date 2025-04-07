package examenmandos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalMandos {

	// Creamos el Scanner para leer la información introducida por el usuario.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos un arrayList donde almacenar todos los mandos creados.
		ArrayList<MandoDistancia> mandos = new ArrayList<MandoDistancia>();

		// Mandos de Televisión
		MandoTelevision mandoTV1 = new MandoTelevision("Sony TV", 5.5, 15.0, 50.0, 20, 5);
		MandoTelevision mandoTV2 = new MandoTelevision("Samsung TV", 5.0, 16.1, 34.0, 10, 3);
		MandoTelevision mandoTV3 = new MandoTelevision("Philips TV", 4.0, 14.8, 41.0, 15, 2);

		// Mandos de Minicadena
		Minicadena minicadena1 = new Minicadena("Minicadena Sony", 18.0, 7.5, 80.0, 30);
		Minicadena minicadena2 = new Minicadena("Minicadena LG", 17.5, 7.2, 75.0, 50);
		Minicadena minicadena3 = new Minicadena("Minicadena Pioneer", 18.3, 7.0, 70.0, 40);

		// Mandos de Aire Acondicionado
		MandoAireAcondicionado mandoAire1 = new MandoAireAcondicionado("LG AC", 4.0, 12.0, 40.0);
		MandoAireAcondicionado mandoAire2 = new MandoAireAcondicionado("Samsung AC", 6.0, 12.5, 30.0);

		// Mandos de Aspiradora
		MandoAspiradora mandoAspiradora1 = new MandoAspiradora("Aspiradora Dyson", 4.0, 9.0, 50.0, 2);
		MandoAspiradora mandoAspiradora2 = new MandoAspiradora("Aspiradora Hoover", 5.0, 9.2, 55.0, 1);

		// Añadimos todos los objetos a nuestra lista.
		mandos.add(mandoTV1);
		mandos.add(mandoTV2);
		mandos.add(mandoTV3);
		mandos.add(minicadena1);
		mandos.add(minicadena2);
		mandos.add(minicadena3);
		mandos.add(mandoAspiradora1);
		mandos.add(mandoAspiradora2);
		mandos.add(mandoAire1);
		mandos.add(mandoAire2);

		// Llamamos al metodo sort de collections para ordenar nuestro ArrayList de
		// mandos.
		Collections.sort(mandos);

		// Recorremos la lista de mandos mediante for y vamos imprimiendo cada mando.
		for (MandoDistancia m : mandos) {
			System.out.println(m);
			System.out.println("Encendemos el mando...");
			m.encenderMando();

			if (m instanceof MandoTelevision) {
				TV((MandoTelevision) m);
			} else if (m instanceof Minicadena) {
				minicadenas((Minicadena) m);
			} else if (m instanceof MandoAspiradora) {
				aspiradoras((MandoAspiradora) m);
			} else {

			}
		}

		// Cierre de Scanner
		sc.close();
	}

	public static void TV(MandoTelevision m) {
		// Creamos la variable opc como char para almacenar la opción seleccionada por
		// el usuario.
		char opc;

		// Creamos la variable nuevoCanal como int para almacenar el nuevo canal
		// introducido por el usuario.
		int canal;

		do {
			System.out.println("----MENU----");
			System.out.println("a. Cambiar el canal.");
			System.out.println("b. Subir el volumen.");
			System.out.println("c. Bajar el volumen.");
			System.out.println("d. Salir.");
			System.out.print("Introduce una opc: ");
			opc = sc.nextLine().charAt(0);

			switch (opc) {
			case 'a' -> {
				System.out.println("Introduce un nuevo canal entre 1 y 100");
				canal = sc.nextInt();
				sc.nextLine();
				m.setCanal(canal);
			}
			case 'b' -> {
				m.subirVolumen();
			}
			case 'c' -> {
				m.bajarVolumen();
			}
			case 'd' -> {
				System.out.println("Saliendo del menu de la televisión");
			}
			default -> {
				System.out.println("La opción introducida es incorrecta.");
			}
			}
			System.out.println(m);
		} while (opc != 'd');
	}

	public static void minicadenas(Minicadena m) {
		// Creamos la variable opc como char para almacenar la opción seleccionada por
		// el usuario.
		char opc;

		do {
			System.out.println("----MENU----");
			System.out.println("a. Subir el volumen.");
			System.out.println("b. Bajar el volumen.");
			System.out.println("c. Salir.");
			System.out.print("Introduce una opc: ");
			opc = sc.nextLine().charAt(0);

			switch (opc) {
			case 'a' -> {
				m.subirVolumen();
			}
			case 'b' -> {
				m.bajarVolumen();
			}
			case 'c' -> {
				System.out.println("Saliendo del menu de la minicadena");
			}
			default -> {
				System.out.println("La opción introducida es incorrecta.");
			}
			}
			System.out.println(m);
		} while (opc != 'c');
	}

	public static void aspiradoras (MandoAspiradora m) {
		// Creamos la variable opc como char para almacenar la opción seleccionada por
		// el usuario.
		char opc;

		do {
			System.out.println("----MENU----");
			System.out.println("a. Subir velocidad.");
			System.out.println("b. Bajar velocidad.");
			System.out.println("c. Salir.");
			System.out.print("Introduce una opc: ");
			opc = sc.nextLine().charAt(0);

			switch (opc) {
			case 'a' -> {
				m.subirVelocidad();
			}
			case 'b' -> {
				m.bajarVelocidad();
			}
			case 'c' -> {
				System.out.println("Saliendo del menu del mando de la aspiradora");
			}
			default -> {
				System.out.println("La opción introducida es incorrecta.");
			}
			}
			System.out.println(m);
		} while (opc != 'c');
	}
}
