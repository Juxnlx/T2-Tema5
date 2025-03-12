package part1.ejercicio4;

public class Lavadora extends Elestrodomestico {

	/**
	 * Creamos el atributo carga como double para almacenar la carga de una
	 * lavadora.
	 */
	private double carga = 5;

	/**
	 * Constructor con los atributos heredados de la clase padre precioBase y peso.
	 * 
	 * @param precioBase El precio base de una lavadora.
	 * @param peso       El peso de una lavadora.
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los atributos heredados de la clase padre mas el propio
	 * de la clase lavadora, carga.
	 * 
	 * @param precioBase   El precio base de la lavadora.
	 * @param color        El color de la lavadora.
	 * @param consumoEnerg El consumo de la lavadora.
	 * @param peso         El peso de la lavadora.
	 * @param carga        La carga de la lavadora.
	 */
	public Lavadora(double precioBase, String color, char consumoEnerg, double peso, double carga) {
		super(precioBase, color, consumoEnerg, peso);

		// Comprobamos si la carga es mayor que 0.
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * Esta función se encarga de devolver la carga de una lavadora.
	 * 
	 * @return La carga de una lavadora.
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * Esta función se encarga de comprobar si la carga de una lavadora es mayor que
	 * 30, si es así incrementa el precio base en + 50.
	 */
	public void precioFinal() {
		//Llamamos a la función padre.
		super.precioFinal();
		
		if (this.carga > 30) {
			super.setPrecioBase(super.getPrecioBase() + 50);
		}
	}

}
