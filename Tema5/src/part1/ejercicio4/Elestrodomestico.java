package part1.ejercicio4;

public class Elestrodomestico {

	/**
	 * Creamos un enumerado del consumo energetico para almacenar solo la
	 * clasificación que puede tener que siempre va a ser una letra entre A - F.
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	/**
	 * Creamos un enumerado de color para almacenar solo uno de los colores posibles
	 * que existen.
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Creamos el atributo precioBase como double para almacenar el precio base de
	 * un elestrodomestico.
	 */
	private double precioBase = 100;

	/**
	 * Creamos el atributo color como String para almacenar el color de un
	 * elestrodomestico.
	 */
	private Color color = Color.BLANCO;

	/**
	 * Creamos el atributo consumoEnerg como char para almacenar el consumo de un
	 * elestrodomestico.
	 */
	private ConsumoEnergetico consumoEnerg = ConsumoEnergetico.F;

	/**
	 * Creamos el atributo peso como double para almacenar el peso de un
	 * elestrodomestico.
	 */
	private double peso = 5;

	/**
	 * Creamos un constructor solo con el precioBase y el peso de un
	 * elestrodomestico.
	 * 
	 * @param precioBase El precio de un elestrodomestico.
	 * @param peso       El peso de un elestrodomestico.
	 */
	public Elestrodomestico(double precioBase, double peso) {
		// Comprobamos si el precio es mayor que 0.
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		// Comprobamos si el peso es mayor que 0.
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Creamos un constructor con todos los atributos de la clase Elestrodomestico.
	 * 
	 * @param precioBase   El precio de un elestrodomestico.
	 * @param color        El color de un elestrodomestico.
	 * @param consumoEnerg El consumo de un elestrodomestico.
	 * @param peso         El peso de un elestrodomestico.
	 */
	public Elestrodomestico(double precioBase, String color, char consumoEnerg, double peso) {
		// Comprobamos si el precio es mayor que 0.
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}

		// Comprobamos si el color es distinto de null.
		if (color != null) {
			// Llamamos a la función comprobarColor para hacer la comprobación.
			comprobarColor(color.toUpperCase());
		}

		// Llamamos a la función comprobarConsumoEnergetico para comprobar si el valor
		// introducido es alguno de los permitidos.
		comprobarConsumoEnergetico(consumoEnerg);

		// Comprobamos si el peso es mayor que 0.
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Esta función se encarga de devolver el precio base de un elestrodomestico.
	 * 
	 * @return El precio base de un elestrodomestico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * Esta función se encarga de modificar el precio de un elestrodomestico por el
	 * pasado por parametro.
	 * 
	 * @param precioBase El nuevo precio del elestrodomestico.
	 */
	public void setPrecioBase(double precioBase) {
		// Comprobamos si el precio es mayor que 0.
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
	}

	/**
	 * Esta función se encarga de devolver el color de un elestrodomestico.
	 * 
	 * @return El color de un elestrodomestico.
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Esta función se encarga de devolver el consumo de un elestrodomestico.
	 * 
	 * @return El consumo de un elestrodomestico.
	 */
	public ConsumoEnergetico getConsumoEnerg() {
		return consumoEnerg;
	}

	/**
	 * Esta función se encarga de devolver el peso de un elestrodomestico.
	 * 
	 * @return El peso de un elestrodomestico.
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Esta función se encarga de comprobar si el tipo char introducido por
	 * parametro es alguno de los que se encuentra en el enum.
	 * 
	 * @param tipoEnerg El tipo de consumo energetico seleccionado.
	 */
	private void comprobarConsumoEnergetico(char tipoEnerg) {
		switch (tipoEnerg) {
		case 'A', 'B', 'C', 'D', 'E' -> {
			this.consumoEnerg = ConsumoEnergetico.valueOf(String.valueOf(tipoEnerg).toUpperCase());
		}
		}
	}

	/**
	 * Esta función se encarga de comprobar si el tipo de String introducido por
	 * parametro es alguno de los que se encuentra en el enum.
	 * 
	 * @param color El tipo de color seleccionado.
	 */
	private void comprobarColor(String color) {
		switch (color) {
		case "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color);
		}
		}
	}

	/**
	 * Esta función se encarga de modificar el precio base segun el consumo
	 * energetico y el peso de cada electrodomestico.
	 */
	public void precioFinal() {

		// Comprobamos cual es el tipo de consumo seleccionado y se le aplicará el
		// suplemento correspondiente.
		switch (this.consumoEnerg) {
		case A -> {
			this.precioBase += 100;
		}
		case B -> {
			this.precioBase += 80;
		}
		case C -> {
			this.precioBase += 60;
		}
		case D -> {
			this.precioBase += 50;
		}
		case E -> {
			this.precioBase += 30;
		}
		case F -> {
			this.precioBase += 10;
		}
		}

		// Comprobamos si el peso se encuentra entre los valores establecido y si es así
		// se le aplicará el suplemento correspondiente.
		if (this.peso >= 0 && this.peso <= 19) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase += 80;
		} else if (this.peso >= 80) {
			this.precioBase += 100;
		}

	}
}
