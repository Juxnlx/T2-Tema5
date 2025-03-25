package interfaz.ej3;

import java.util.Random;

/**
 * Esta clase hereda los metodos abstractos de AnimalDomestico y los define
 * segun las funcionalidades del Gato en concreto.
 */
public class Gato extends AnimalDomestio {

	/**
	 * Heredamos el contructor de la clase AnimalDomestico.
	 * 
	 * @param nombre El nombre del gato.
	 * @param raza   La raza del gato.
	 * @param edad   Los años del gato.
	 * @param color  El color del gato.
	 */
	public Gato(String nombre, String raza, int edad, String color) {
		super(nombre, raza, edad, color);
	}

	/**
	 * Esta función se encarga de imprimir un mesaje de que el gato ha sido
	 * atragantado.
	 */
	public void toserBolaPelo() {
		System.out.println("El gato se atraganta");
	}

	/**
	 * Heredamos la clase hacer caso que nos hara caso un 5% de veces.
	 * 
	 * @return true si hace caso, false en caso contrario.
	 */
	@Override
	public boolean hacerCaso() {
		boolean caso = false;

		Random rand = new Random();

		if (rand.nextDouble(0, 11) <= 0.5) {
			caso = true;
		}

		return caso;
	}

	/**
	 * Esta función se encarga de imprimir el ruido que hace un gato cuando maulla.
	 */
	@Override
	public void hacerRuido() {
		System.out.println("MIAU MIAUUUU");

	}

}
