package analisis.ej1;

public class Vehiculos {
	/**
	 * Creamos el atributo marca como String para almacenar la marca de un vehiculo.
	 */
	private String marca;

	/**
	 * Creamos el atributo modeo como String para almacenar el modelo del vehiculo.
	 */
	private String modelo;

	/**
	 * Creamos el atributo color como String para almacenar el color del vehiculo.
	 */
	private String color;

	/**
	 * Creamos el atributo matricula como String para almacenar la matricula del
	 * vehiculo.
	 */
	private String matricula;

	/**
	 * Creamos el atributo estadoMotor como boolean para indicar mediante un boleano
	 * si el motor esta encendido o apagado.
	 */
	private boolean estadoMotor = false;

	/**
	 * Creamos el atributo marchaActual como int para almacenar la marcha del
	 * vehiculo.
	 */
	private int marchaActual = 0;

	/**
	 * Creamos el atributo velocidadActual como int para almacenar la velocidad del
	 * vehiculo.
	 */
	private int velocidadActual = 0;

	/**
	 * Creamos un constructor de la clase Vehiculos con los siguientes atributos.
	 * 
	 * @param marca     La marca del vehiculo.
	 * @param modelo    El modelo del vehiculo.
	 * @param color     El color del vehiculo.
	 * @param matricula La matricula del vehiculo.
	 */
	public Vehiculos(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}

		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}

		if (color != null && !color.isBlank()) {
			this.color = color;
		}

		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}

	/**
	 * Esta función se encarga de devolver la marca de un vehiculo.
	 * 
	 * @return La marca de un vehiculo.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Esta función se encarga de devolver el modelo de un vehiculo.
	 * 
	 * @return El modelo de un vehiculo.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Esta función se encarga de devolver el color de un vehiculo.
	 * 
	 * @return El color de un vehiculo.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Esta función se encarga de devolver la matricula de un vehiculo.
	 * 
	 * @return La matricula de un vehiculo.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Esta función se encarga de devolver true o false dependiendo de si el
	 * vehiculo esta apagado o encendido.
	 * 
	 * @return true si esta encendido, false en caso contrario.
	 */
	public boolean isEstadoMotor() {
		return estadoMotor;
	}

	/**
	 * Esta función se encarga de devolver la marcha actual de un vehiculo.
	 * 
	 * @return La marcha actual de un vehiculo.
	 */
	public int getMarchaActual() {
		return marchaActual;
	}

	/**
	 * Esta función se encarga de devolver la velocidad actual de un vehiculo.
	 * 
	 * @return La valocidad actual de un vehiculo.
	 */
	public int getVelocidadActual() {
		return velocidadActual;
	}

	/**
	 * Esta función se encarga de poner el estado del motor a false para indicar que
	 * esta parado, la marcha a 0 y la velocidad actual a 0 tambien. Se entiende que
	 * el coche esta parado.
	 */
	public void parar() {
		this.estadoMotor = false;
		this.marchaActual = 0;
		this.velocidadActual = 0;
	}

	/**
	 * Esta función se encarga de arrarcar un coche por lo tanto se pone el estado
	 * del motor a true y la marcha actual y la velocidad actual pueden seguir a 0.
	 */
	public void arrancar() {
		this.estadoMotor = true;
		this.marchaActual = 0;
		this.velocidadActual = 0;
	}

	/**
	 * Esta función se encarga de comprobar que la marcha sea menor que 5 porque mas
	 * de cinco no puede tener. Y en ese caso incrementamos en +1 la marcha actual.
	 */
	public void subirMarcha() {
		this.marchaActual++;
	}

	/**
	 * Esta función se encarga de comprobar que la marcha actual del coche sea mayor
	 * que cero, en ese caso si decrementamos en -1 la marcha.
	 */
	public void bajarMarcha() {
		this.marchaActual--;
	}

	/**
	 * Esta función se encarga de ir mostrando como va acelerando un vehiculo hasta
	 * llegar a la velocidad pasada como parametro.
	 * 
	 * @param velocidad La velocidad hasta la que debemos de alcanzar con nuestro
	 *                  vehiculo.
	 * @return true si la velocidad pasada como parametro es mayor que la actual del
	 *         vehiculo.
	 */
	public boolean acelerar(int velocidad) {
		boolean res = false;

		// Comprobamos si la velocidad actual es menor que hasta la velocidad hasta
		// donde queremos alcanzar.
		if (this.velocidadActual < velocidad) {
			res = true;

			// Mientras la velocidad actual es menor que la que queremos alcanza, vamos
			// incrementando la velocidad de 1 en 1 y la vamos imprimiendo.
			while (this.velocidadActual < velocidad) {

				this.velocidadActual++;
				System.out.println(this.velocidadActual);

				// En el caso de que la velocidad se encuentre dentro de este rango y la marcha
				// sea menor que 1...
				if (this.velocidadActual >= 0 && this.velocidadActual < 30 && marchaActual < 1) {
					// Subimos de macha.
					subirMarcha();
					// Y mostramos el cambio de marcha que acabamos de hacer.
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 30 && this.velocidadActual < 50 && marchaActual < 2) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 50 && this.velocidadActual < 70 && marchaActual < 3) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 70 && this.velocidadActual < 100 && marchaActual < 4) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 100 && marchaActual < 5) {
					subirMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				}
			}
		}

		// Devolvemos res, la variable donde se almacena si ha sido posible acelerar el
		// vehiculo o no.
		return res;
	}

	/**
	 * Esta función se encarga de ir mostrando como va frenando un vehiculo hasta
	 * llegar a la velocidad pasada como parametro.
	 * 
	 * @param velocidad La velocidad hasta la que debemos de desacelerar con nuestro
	 *                  vehiculo.
	 * @return true si la velocidad pasada como parametro es menor que la actual del
	 *         vehiculo.
	 */
	public boolean frenar(int velocidad) {
		boolean res = false;

		// Comprobamos si al velocidad actual es mayor que la pasada como parametro.
		if (this.velocidadActual > velocidad) {
			res = true;

			// Coprobamos si al velocidad actual es mayor que la pasada como parametro, si
			// es así imprimimos la velocidad actual y vamos decrementando la velocidad.
			while (this.velocidadActual > velocidad) {
				System.out.println(this.velocidadActual);
				this.velocidadActual--;

				// En el caso de que la velocidad se encuentre dentro de este rango y la marcha
				// sea mayor que 1...
				if (this.velocidadActual >= 0 && this.velocidadActual < 30 && marchaActual > 1) {
					// Bajamos de macha.
					bajarMarcha();
					// Imprimimos la marcha actual.
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 30 && this.velocidadActual < 50 && marchaActual > 2) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 50 && this.velocidadActual < 70 && marchaActual > 3) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 70 && this.velocidadActual < 100 && marchaActual > 4) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				} else if (this.velocidadActual >= 100 && marchaActual > 5) {
					bajarMarcha();
					System.out.println("Cambio de marcha: " + this.marchaActual);
				}
			}
		}
		// Devolvemos res, la variable donde se almacena si ha sido posible desacelerar el
		// vehiculo o no.
		return res;
	}
}
