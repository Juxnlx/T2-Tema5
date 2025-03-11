package part1.ejercicio3;

public class NoPerecedero extends Productos {
	/**
	 * Creamos la variable tipo como String para almacenar el tipo de producto.
	 */
	private String tipo;

	/**
	 * Creamos este constructor con todos los parametros de la clase padre y tipo.
	 * 
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 * @param tipo   El tipo del producto.
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		// Comprobamos si el tipo es distinto de null y no es ni cadena vacia ni
		// espacios de blancos.
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}

	/**
	 * Esta función devuelve el tipo de un producto.
	 * 
	 * @return El tipo de un producto.
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Esta función modifica el tipo de un producto por el pasado por parametro.
	 * 
	 * @param tipo El nuevo tipo por el que sera modificado el tipo.
	 */
	public void setTipo(String tipo) {
		// Comprobamos si el tipo es distinto de null y no es ni cadena vacia ni
		// espacios de blancos.
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}
	
	/**
	 * Esta función nos calcula el precio total con la cantidad de productos pasados
	 * como parametro.
	 * 
	 * @param cant La cantidad de productos.
	 * @return El precio total de todos los productos.
	 */
	public double calcular(int cant) {
		// Creamos la variable precioTotal como double para almacenar la cantidad total.
		double precioTotal;

		// Calculamos el precio total.
		precioTotal = (double) super.getPrecio() * cant;

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

		solProducto += " | " + "Tipo: " + this.tipo;

		// Devolvemos la variable solProducto.
		return solProducto;
	}

}
