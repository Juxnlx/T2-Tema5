package interfaz.ej3;

/**
 * Esta clase implmenta los metodos Animal y crea algunos metodos abtractos para
 * cada animal concreto.
 */
public abstract class AnimalDomestio implements Animal {

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del animal.
	 */
	private String nombre;

	/**
	 * Creamos el atributo raza como String para almacenar la raza del animal.
	 */
	private String raza;

	/**
	 * Creamos el atributo edad como int para almacenar la edad del animal.
	 */
	private int edad;

	/**
	 * Creamos el atributo color como String para almacenar el color del animnal.
	 */
	private String color;

	/**
	 * Este metodo se encarga de imprimir un mensaje de que el animal ha visitado al
	 * veterinario.
	 */
	public void vacunar() {
		System.out.println("Visita al veterinario.");
	}

	/**
	 * Este metodo se implementara en cada animal que herede de AnimalDomestico.
	 * 
	 * @return true o false si ha hecho caso o no.
	 */
	public abstract boolean hacerCaso();

	/**
	 * Este metodo se encarga de imprimir el sonido que hace un animal al comer.
	 */
	public void comer() {
		System.out.println("ÑAM ÑAM ÑAM");
	}

	/**
	 * Esta función se encarga de imprimir el sonido que hace un animal al dormir.
	 */
	public void dormir() {
		System.out.println("ZZZZZzzzzzzzzzz");
	}

	public abstract void hacerRuido();
}
