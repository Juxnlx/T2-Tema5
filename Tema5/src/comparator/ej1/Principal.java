package comparator.ej1;

import java.util.Arrays;
import java.util.Comparator;
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

		Comparator<Integer> compararNumeros = (a, b) -> {
			return a-b;
		};
			

		// Lo ordenamos de forma decreciente llamando a nuestra clase CompararNumeros.
		Arrays.sort(listaNumeros, compararNumeros);
		
		Arrays.sort(listaNumeros, (a, b) -> { return a-b;});

		// Imprimimos el array.
		System.out.println(Arrays.toString(listaNumeros));

	}
}
