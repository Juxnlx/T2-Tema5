package part1.ejercicio5;

/**
 * Esta clase abstracta contiene el número de lados y el metodo area que tendran
 * que implementar cada poligono en su clase.
 */
public abstract class Poligono {

	/**
	 * Creamos el atributo numeroLados como int para almacenar el número de lados de
	 * un poligono.
	 */
	protected int numeroLados;

	/**
	 * Creamos el constructor con el parametro de entrada numeroLados.
	 * 
	 * @param numeroLados El numeroLados de un poligono.
	 */
	public Poligono(int numeroLados) {
		// Comprbamos si el número de lados es mayor o igual a 3.
		if (numeroLados >= 3) {
			this.numeroLados = numeroLados;
		}

	}

	/**
	 * Esta función se encarga de devolver el número de lados de un poligono.
	 * 
	 * @return El número de lados de un poligono.
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Esta función se encarga de calcular el area de un poligono, en aquella clase
	 * hija que se llame.
	 */
	public abstract double area();

	/**
	 * Esta función se encarga de devolver en forma de cadena el numero de lados de
	 * un poligono.
	 * 
	 * @return El número de lados del poligono.
	 */
	@Override
	public String toString() {
		// Creamos la variable solPoli como String para almacenar el forma de cadena el
		// número de lados del poligono.
		String solPoli;

		// Almacenamos en forma de cadena el número de lados.
		solPoli = String.valueOf(this.numeroLados);

		// Devolvemos solPoli donde se encuentra el número de lados de un poligono.
		return solPoli;
	}

}
