package part1.ejercicio5;

/**
 * Clase rectangulo con sus dos lados y el metodo area de su clase padre.
 */
public class Rectangulo extends Poligono {

	/**
	 * Creamos el atributo lado1 como double para almacenar el tamaño del lado 1 del
	 * rectangulo.
	 */
	private double lado1 = 1;

	/**
	 * Creamos el atributo lado2 como double para almacenar el tamaño del lado 2 del
	 * rectangulo.
	 */
	private double lado2 = 1;

	/**
	 * Creamos un constructor sin parametros, solo inicializamos el número de lados
	 * de cada poligono en el caso del rectangulo es 4.
	 */
	public Rectangulo() {
		// Inicializamos a 4 el número de lados.
		super(4);
	}

	/**
	 * Creamos el constructor con parametros lado1 y lado2.
	 * 
	 * @param lado1 El primer lado del rectangulo.
	 * @param lado2 El segundo lado del rectangulo.
	 */
	public Rectangulo(double lado1, double lado2) {
		// Inicializamos a 4 el número de lados.
		super(4);

		// Comprobamos que el lado 1 sea positivo.
		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		// Comprobamos que el lado 2 sea positivo.
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Creamos esta función para devolver el lado 1 del rectangulo.
	 * 
	 * @return El lado 1 del rectangulo.
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Esta función se encarga de modificar el lado 1 del rectangulo.
	 * 
	 * @param lado1 El nuevo valor del lado 1.
	 */
	public void setLado1(double lado1) {
		// Comprobamos que el lado 1 sea positivo.
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Esta función se encarga para devolver el lado 2 del rectangulo.
	 * 
	 * @return El lado 2 del rectangulo.
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Esta función se encarga de modificar el lado 2 del rectangulo.
	 * 
	 * @param lado2 El nuevo valor del lado 2
	 */
	public void setLado2(double lado2) {
		// Comprobamos que el lado 2 sea positivo.
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Esta función se encarga de calcular el area del rectangulo.
	 * 
	 * @return El area del rectangulo.
	 */
	@Override
	public double area() {
		// Creamos el areaRect como double para almacenar el area del rectangulo.
		double areaRect;

		// Almacenamos en areaRect el area del rectangulo multiplicando lado por lado.
		areaRect = this.lado1 * this.lado2;

		// Devolvemos el area del rectagulo almacenado en la variable areaRect.
		return areaRect;
	}

	/**
	 * Esta función se encarga de almacenar en una cadena toda la información de un
	 * rectangulo.
	 * 
	 * @return La cadena donde se almacena toda información del rectangulo.
	 */
	@Override
	public String toString() {
		// Creamos la variable infoRecta como String para almacenar el forma de cadena
		// el número de lados del rectangulo.
		String infoRecta;

		// Almacenamos en la variable infoRecta.
		infoRecta = "Rectangulo \n";
		infoRecta += "Lado 1: " + this.lado1 + "\n";
		infoRecta += "Lado 2: " + this.lado2 + "\n";

		// Devolvemos infoRecta donde se encuentra el número de lados de un rectangulo.
		return infoRecta;
	}

}
