package part1.ejercicio4;

public class Television extends Elestrodomestico {

	/**
	 * Creamos el atributo resolucion como double para almacenar las pulgadas de una
	 * television.
	 */
	private double resolucion = 20;

	/**
	 * Creamos la variable TDT como boolean para almacenar si tiene o no TDT.
	 */

	private boolean TDT = false;

	/**
	 * Constructor con los atributos heredados de la clase padre precioBase y peso.
	 * 
	 * @param precioBase El precio base de una television.
	 * @param peso       El peso de una television.
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	/**
	 * Constructor con todos los atributos heredados de la clase padre mas el propio
	 * de la clase television, carga.
	 * 
	 * @param precioBase   El precio base de una television.
	 * @param color        El color de una television.
	 * @param consumoEnerg El consumo de una television.
	 * @param peso         El peso de la lavadora.
	 * @param resolucion   La resolucion de una television.
	 * @param TDT          El sintonizador de una television.
	 */
	public Television(double precioBase, String color, char consumoEnerg, double peso, double resolucion, char TDT) {
		super(precioBase, color, consumoEnerg, peso);

		// Comprobamos si la resolucion es mayor que 0.
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}

		//Llamamos a la función comprobarTDT.
		comprobarTDT(TDT);
		
	}

	/**
	 * Esta función se encarga de devolver si true o false dependiendo de si la tv
	 * sintoniza TDT.
	 * 
	 * @return true si tiene sintonizador, false si no lo tiene.
	 */
	public boolean isTDT() {
		return TDT;
	}

	/**
	 * Esta función se encarga de devolver la resolución de una tv.
	 * 
	 * @return La resolución de una televisión.
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * Esta función se encarga se comprobar si el caracter pasado como parametro es
	 * valido.
	 * 
	 * @param TDT El caracter indicado para poner el sintonizador a true.
	 */
	public void comprobarTDT(char TDT) {
		if (TDT == 'T') {
			this.TDT = true;
		}
	}

	public void precioFinal() {
		// Llamamos a la función padre.
		super.precioFinal();

		// Creamos la variable incremento como double para hacer el calculo del 30% del
		// precio.
		double incremento;

		// Hacemos una regla del 3 para calcular ese incremto a sumar si la resulución
		// es mayor a 40.
		incremento = (30 * super.getPrecioBase()) / 100;

		// Comprobamos si la resolución es mayor de 40, si es así incrementamos el
		// precio en un 30%.

		if (this.resolucion > 40) {
			super.setPrecioBase(super.getPrecioBase() + incremento);
		}

		// Comprobamos si el TDT es igual a true, si es así incrementamos 50 al precio
		// base.
		if (this.TDT == true) {
			super.setPrecioBase(super.getPrecioBase() + 50);
		}
	}

}