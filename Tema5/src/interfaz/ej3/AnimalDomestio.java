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
	 * Creamos un constructor con todos los atributos de la clase AnimalDomestico
	 * 
	 * @param nombre El nombre del animal.
	 * @param raza   La raza del animal.
	 * @param edad   Los años del animal.
	 * @param color  El color del animal.
	 */
	public AnimalDomestio(String nombre, String raza, int edad, String color) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (raza != null && !raza.isBlank()) {
			this.raza = raza;
		}
		
		if (edad > 0) {
			this.edad = edad;
		}
		
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

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

	/**
	 * Esta función se encaga de imprimir el ruido que hace cada animal concreto.
	 */
	public abstract void hacerRuido();
}
