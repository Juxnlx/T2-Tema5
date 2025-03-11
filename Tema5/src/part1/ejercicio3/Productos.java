package part1.ejercicio3;

public class Productos {
	/**
	 * Creamos el atributo nombre como String para almacenar el nombre de un
	 * producto.
	 */
	private String nombre;

	/**
	 * Creamos el atributo precio como double para almacenar el precio de un
	 * producto.
	 */
	private double precio;

	/**
	 * Creamos un constructor con todos los parametros nombre y precio.
	 * 
	 * @param nombre El nombre del producto.
	 * @param precio El precio del producto.
	 */
	public Productos(String nombre, double precio) {
		// Comprobamos si el nombre es distinto de null y no es ni cadena vacia ni
		// espacios de blancos.
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		// Comprobamos si el precio es mayor que 0.
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Esta función nos devuelve el nombre del producto.
	 * 
	 * @return El nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función nos permite modificar el nombre del producto.
	 * 
	 * @param nombre El nombre nuevo por el que modificar el nombre del producto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Esta función nos devuelve el precio del producto.
	 * 
	 * @return El precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Esta función nos permite modificar el precio del producto.
	 * 
	 * @param precio El precio nuevo por el que modificar el precio del producto.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
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
		precioTotal = (double) precio * cant;

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
		String solProducto = "";

		solProducto += "Nombre: " + this.nombre + " | " + "Precio: " + this.precio;

		// Devolvemos la variable solProducto.
		return solProducto;
	}

}
