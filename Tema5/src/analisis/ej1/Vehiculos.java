package analisis.ej1;

public abstract class Vehiculos {
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
	 * Creamos el atributo velocidadActual como double para almacenar la velocidad
	 * del vehiculo.
	 */
	private double velocidadActual = 0;

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
		if (this.marchaActual < 5) {
			this.marchaActual++;
		}
	}

	/**
	 * Esta función se encarga de comprobar que la marcha actual del coche sea mayor
	 * que cero, en ese caso si decrementamos en -1 la marcha.
	 */
	public void bajarMarcha() {
		if (this.marchaActual > 0) {
			this.marchaActual--;
		}
	}

}
