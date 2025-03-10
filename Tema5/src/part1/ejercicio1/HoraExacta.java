package part1.ejercicio1;

public class HoraExacta extends Hora {

	/**
	 * Creamos el atributo segundo como int para almacenar los segundos de una hora.
	 */
	private int segundos;

	/**
	 * Creamos un constructor con todos los atributos de la clase padre mas el
	 * segundo de esta clase.
	 * 
	 * @param hora     Las horas de una hora.
	 * @param minuto   Los minutos de una hora.
	 * @param segundos Los segundos de una hora.
	 */
	public HoraExacta(int hora, int minuto, int segundos) {
		super(hora, minuto);
		// Comprobamos si los segundos estan comprendidos entre 0 y 59, para que sean
		// validos.
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}
	

	/**
	 * Esta función se encarga de modificar los segundos de la hora con los nuevos
	 * pasados como parametro.
	 * 
	 * @param segundos Los nuevos segundos por los que vamos a cambiar los segundos
	 *                 actuales.
	 */
	public void setSegundos(int segundos) {
		// Comprobamos si los segundos estan comprendidos entre 0 y 59, para que sean
		// validos.
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}
	

	/**
	 * Esta función se encarga de incrementar un segundo en la hora.
	 */
	public void inc() {
		// Añadimos un segundo.
		segundos++;

		// Comprobamos si los segundos son mayores que 59, si es así los segundos los
		// establecemos a 0 y llamamos a la función padre inc.
		if (segundos > 59) {
			segundos = 0;
			super.inc();
		}
	}
	
	
	/**
	 * Esta función se encarga de almacenar en una cadena la forma en la que se va a
	 * mostrar una hora.
	 * 
	 * @return La cadena donde se alamcena la hora.
	 */
	@Override
	public String toString() {
		// Creamos la variable solHora como String para almacenar como se va a mostrar
		// nuestra hora.
		String solHora = super.toString();

		// Comprobamos si los minutos estan entre 0 y 9 para concatenarle un 0 delante, si no
		// solo se concatena los minutos.
		if (segundos >= 0 && segundos <= 9) {
			solHora += "0" + segundos;
		} else {
			solHora += segundos + ":";
		}

		// Devolvemos la cadena donde se almacena la hora.
		return solHora;
	}
}
