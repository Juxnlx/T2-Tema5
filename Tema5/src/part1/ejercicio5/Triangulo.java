package part1.ejercicio5;

public class Triangulo extends Poligono {
	/**
	 * Creamos el atributo lado1 como double para almacenar el tamaño del lado 1 del
	 * triangulo.
	 */
	private double lado1 = 1;

	/**
	 * Creamos el atributo lado2 como double para almacenar el tamaño del lado 2 del
	 * triangulo.
	 */
	private double lado2 = 1;

	/**
	 * Creamos el atributo lado3 como double para almacenar el tamaño del lado 3 del
	 * triangulo.
	 */
	private double lado3 = 1;

	/**
	 * Creamos un constructor sin parametros, solo inicializamos el número de lados
	 * de cada poligono en el caso del triangulo es 4.
	 */
	public Triangulo() {
		// Inicializamos a 3 el número de lados.
		super(3);
	}

	/**
	 * Creamos el constructor con parametros lado1 y lado2.
	 * 
	 * @param lado1 El primer lado del triangulo.
	 * @param lado2 El segundo lado del triangulo.
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		// Inicializamos a 3 el número de lados.
		super(3);

		// Comprobamos que el lado 1 sea positivo.
		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		// Comprobamos que el lado 2 sea positivo.
		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		// Comprobamos que el lado 3 sea positivo.
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Creamos esta función para devolver el lado 1 del triangulo.
	 * 
	 * @return El lado 1 del triangulo.
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Esta función se encarga de modificar el lado 1 del triangulo.
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
	 * Esta función se encarga para devolver el lado 2 del triangulo.
	 * 
	 * @return El lado 2 del triangulo.
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Esta función se encarga de modificar el lado 2 del triangulo.
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
	 * Creamos esta función para devolver el lado 3 del triangulo.
	 * 
	 * @return El lado 3 del triangulo.
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Esta función se encarga de modificar el lado 3 del triangulo.
	 * 
	 * @param lado2 El nuevo valor del lado 3.
	 */
	public void setLado3(double lado3) {
		// Comprobamos que el lado 3 sea positivo.
		if (lado3 > 0) {
			// Comprobamos que el lado 3 sea positivo.
			if (lado3 > 0) {
				this.lado3 = lado3;
			}
		}
	}

	@Override
	public double area() {
		// Creamos el areaT como double para almacenar el area del triangulo.
		double areaT;
		
		//Creamos la variable semiP como double para almacenar el semiperimetro de un triangulo.
		double semiP;
		
		semiP = (lado1 + lado2 + lado3)/2;

		
		areaT = Math.sqrt(semiP*(semiP-lado1)*(semiP-lado2)*(semiP-lado3));

		// Devolvemos el area del triangulo almacenado en la variable areaT.
		return areaT;
	}

	/**
	 * Esta función se encarga de almacenar en una cadena toda la información de un
	 * triangulo.
	 * 
	 * @return La cadena donde se almacena toda información del triangulo.
	 */
	@Override
	public String toString() {
		// Creamos la variable infoTriangulo como String para almacenar el forma de
		// cadena el número de lados del triangulo.
		String infoTriangulo;

		// Almacenamos en la variable infoTriangulo.
		infoTriangulo = "Triangulo \n";
		infoTriangulo += "Lado 1: " + this.lado1 + "\n";
		infoTriangulo += "Lado 2: " + this.lado2 + "\n";
		infoTriangulo += "Lado 3: " + this.lado3 + "\n";

		// Devolvemos infoTriangulo donde se encuentra el número de lados de un
		// triangulo.
		return infoTriangulo;
	}

}
