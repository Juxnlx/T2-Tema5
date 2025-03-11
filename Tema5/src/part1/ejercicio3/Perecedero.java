package part1.ejercicio3;

public class Perecedero extends Productos {

	/**
	 * Creamos el atributo diasCaducar como int para alamcenar los dias a caducar de
	 * un producto
	 */
	private int diasCaducar;

	/**
	 * Creamos este constructor con todos los parametros de la clase padre y
	 * diasCaducar.
	 * 
	 * @param nombre      El nombre del producto.
	 * @param precio      El precio del producto.
	 * @param diasCaducar Los dias a caducar del producto.
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);

		// Comprobamos si los dias son mayores que 0.
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	/**
	 * Esta función nos devuelve los dias a caducar de un producto.
	 * 
	 * @return Los dias a caducar de un producto.
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * Esta función nos permite modificar los dias a caducar de un producto.
	 * 
	 * @param diasCaducar Los nuevos dias a caducar con lo que actualizar los
	 *                    antiguos.
	 */
	public void setDiasCaducar(int diasCaducar) {
		// Comprobamos si los dias son mayores que 0.
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	/**
	 * Esta función nos calcula el precio total con la cantidad de productos pasados
	 * como parametro pero tambien tiene en cuenta los dias a caducar para hacer un
	 * descuento.
	 * 
	 * @param cant La cantidad de productos.
	 * @return El precio total de todos los productos.
	 */
	public double calcular(int cant) {
		// Creamos la variable precioTotal como double para almacenar la cantidad total.
		double precioTotal;

		// Calculamos el precio total.
		precioTotal = (double) super.getPrecio() * cant;

		// Dependiendo de los dias a caducar que queden de un producto, se le aplicará
		// un descuento al precio total o no.
		switch (this.diasCaducar) {
		case 1 -> {
			precioTotal /= 4;
		}
		case 2 -> {
			precioTotal /= 3;
		}
		case 3 -> {
			precioTotal /= 2;
		}
		}

		// Devolvemos precioTotal.
		return precioTotal;
	}

	/**
	 * Esta función almacena en una cadena los datos de un producto.
	 * 
	 * @return La cadena donde se almacena los datos de un producto.
	 */
	@Override
	public String toString() {
		// Creamos la variable solProducto como String para almacenar los datos de un
		// producto.
		String solProducto = super.toString();

		solProducto += " | " + "Días caducidad: " + this.diasCaducar;

		// Devolvemos la variable solProducto.
		return solProducto;
	}
}
