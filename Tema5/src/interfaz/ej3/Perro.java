package interfaz.ej3;

import java.util.Random;

/**
 * Esta clase hereda los metodos abstractos de AnimalDomestico y los define
 * segun las funcionalidades del Perro en concreto.
 */
public class Perro extends AnimalDomestio {

	/**
	 * Esta función se encarga de mostrarnos un mensaje indicando lo que hace el
	 * perro cuando sale a pasear.
	 */
	public void sacarPaseo() {
		System.out.println("Hacer pipi y popo.");
	}

	/**
	 * Heredamos la clase hacer caso que nos hara caso un 90% de veces.
	 * 
	 * @return true si hace caso, false en caso contrario.
	 */
	@Override
	public boolean hacerCaso() {
		boolean caso;

		Random rand = new Random();

		if (rand.nextInt(1, 10) <= 9) {
			caso = true;
		} else {
			caso = false;
		}

		return caso;
	}

	/**
	 * Esta función se encarga de imprimir el ruido que hace un perro cuando ladra.
	 */
	@Override
	public void hacerRuido() {
		System.out.println("GUAU GUAU");

	}

}
