package comparator.ej1;

import java.util.Arrays;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		// Creamos un array de una longitud de 20.
		Integer listaNumeros[] = new Integer[20];

		// Creamos random para generar números aleatorios entre 1 y 100-
		Random rand = new Random();

		// Rellenamos nuestro array con aleatorios.
		for (int i = 0; i < listaNumeros.length; i++) {

			listaNumeros[i] = rand.nextInt(1, 101);

		}

		// Lo ordenamos de forma decreciente llamando a nuestra clase CompararNumeros.
		Arrays.sort(listaNumeros, new CompararNumeros());

		// Imprimimos el array.
		System.out.println(Arrays.toString(listaNumeros));

	}
}
