package part1.ejercicio4;

import java.util.ArrayList;

public class PrincipalElect {

	public static void main(String[] args) {

		// Creamos una lista para almacenar todos los electrodomesticos que queramos.
		ArrayList<Elestrodomestico> electrodomesticos = new ArrayList<Elestrodomestico>();

		// Creamos la variable totalElectrodomestico como double para almacenar el
		// precio total de los electrodomesticos.
		double totalElectrodomestico = 0;

		// Creamos la variable totalLavadoras como double para almacenar el precio total
		// de todas las lavadoras.
		double totalLavadoras = 0;

		// Creamos la variable totalTelevisores como double para almacenar el precio
		// total de todos los televisores.
		double totalTelevisores = 0;

		// Creamos la variable sumaTotal como double para almacenar el precio total de
		// todso los electrodomesticos.
		double sumaTotal = 0;

		// Añadimos distintos tipos de electrodomesticos a la lista.
		electrodomesticos.add(new Elestrodomestico(150, 10));
		electrodomesticos.add(new Lavadora(200, "ROJO", 'B', 40, 35));
		electrodomesticos.add(new Television(500, "NEGRO", 'A', 30, 42, 'T'));
		electrodomesticos.add(new Lavadora(180, 25));
		electrodomesticos.add(new Television(400, "AZUL", 'C', 20, 32, 'F'));

		// Recorremos la lista de electrodomesticos.
		for (Elestrodomestico elec : electrodomesticos) {

			// Llamamos a la función precioFinal de cada electrodomestico.
			elec.precioFinal();

			// En la variable sumaTotal almacenamos el precio base de cada electrodomesticos
			// que se encuentra en nuestra lista.
			sumaTotal += elec.getPrecioBase();

			// Comprobamos si el electrodomestico que estamos recorriendo es una televisión,
			// si es así imprimimos su precio y en el precio total de televisiones le
			// sumamos este precio.
			if (elec instanceof Television) {
				System.out.println("Televisión: " + elec.getPrecioBase());
				totalTelevisores += elec.getPrecioBase();

				// Hacemos la misma comprobación que con la televisión y mostramos el precio de
				// la lavadora y en totalLavadoras sumamos el precio de la lavadora.
			} else if (elec instanceof Lavadora) {
				System.out.println("Lavadora: " + elec.getPrecioBase());
				totalLavadoras += elec.getPrecioBase();

				// Hacemos la misma comprobación con los electrodomesticos, mostramos su precio
				// y almacenamos su precio en totalElectrodomestico.
			} else {
				System.out.println("Electrodomestico: " + elec.getPrecioBase());
				totalElectrodomestico += elec.getPrecioBase();
			}
		}

		// Mostrar resultados finales
		System.out.println("\nTotal Electrodomésticos: " + totalElectrodomestico);
		System.out.println("Total Lavadoras: " + totalLavadoras);
		System.out.println("Total Televisores: " + totalTelevisores);
		System.out.println("Precio final: " + sumaTotal);
	}
}
