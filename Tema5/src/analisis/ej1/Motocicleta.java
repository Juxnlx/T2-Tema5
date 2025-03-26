package analisis.ej1;

public class Motocicleta extends Vehiculos {
	/**
	 * Creamos el atributo cilindrada como int para almacenar la cilindrada de una
	 * motocicleta.
	 */
	private int cilindrada;

	/**
	 * Creamos un constructor con todos los atributos heredados de la clase
	 * Vehiculos mas el propio de la clase Motocicleta.
	 * 
	 * @param marca       La marca de una motocicleta.
	 * @param modelo      El modelo de una motocicleta.
	 * @param color       El color de una motocicleta.
	 * @param matricula   La matricula de una motocicleta.
	 * @param Motocicleta La ciclindrada de una motocicleta.
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);

		if (cilindrada >= 50) {
			this.cilindrada = cilindrada;
		}
	}

	/**
	 * Esta función se encarga de indicarnos si la motocicleta necesita carnet si la
	 * cilindridada es mayor o igual a 125.
	 * 
	 * @return true si requiere carnet, false si no lo requiere.
	 */
	public boolean requiereCarnet() {
		return cilindrada >= 125;
	}

	/**
	 * Esta función se encarga de devolver la cilindrada de una motocicleta.
	 * 
	 * @return La cilindrada de una motocicleta.
	 */
	public int getCilindrada() {
		return cilindrada;
	}
}
