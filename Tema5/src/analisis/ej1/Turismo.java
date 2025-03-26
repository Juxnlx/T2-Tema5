package analisis.ej1;

public class Turismo extends Vehiculos {

	/**
	 * Creamos el enumerado uso para indicar el tipo de uso del turismo.
	 */
	enum Uso {
		PROFESIONAL, PARTICULAR
	}

	/**
	 * Creamos el atributo numPlazas como int para indicar las plazas de un turismo.
	 */
	private int numPlazas;

	/**
	 * Creamos e atributo uso como USO para indicar el uso que tiene el turismo.
	 */
	private Uso uso = Uso.PARTICULAR;

	/**
	 * Creamos un constructor con todos los atributos heredados de la clase
	 * Vehiculos mas los propios de la clase Turismo.
	 * 
	 * @param marca     La marca del turismo.
	 * @param modelo    El modelo del turismo.
	 * @param color     El color del turismo.
	 * @param matricula La matricula del turismo.
	 * @param numPlazas El número de plazas del turismo.
	 * @param uso       El uso del turismo.
	 */
	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String uso) {
		super(marca, modelo, color, matricula);

		if (numPlazas > 0) {
			this.numPlazas = numPlazas;
		}

		if (uso != null) {
			tipoUso(uso);
		}
	}

	/**
	 * Esta función se encarga de comprobar que el uso del turismo sea valido.
	 * 
	 * @param uso
	 */
	public void tipoUso(String uso) {
		switch (uso) {
		case "PROFESIONAL", "PARTICULAR" -> {
			this.uso = Uso.valueOf(uso);
		}
		}
	}
}
