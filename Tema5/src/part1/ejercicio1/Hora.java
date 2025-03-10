package part1.ejercicio1;

public class Hora {

	/**
	 * Creamos el atributo hora como int para almacenar las horas de una hora.
	 */
	private int hora;

	/**
	 * Creamos el atributo minuto como int para almacenar los minutos de una hora.
	 */
	private int minuto;

	/**
	 * Creamos un constructor con todos los parametros de la clase Hora.
	 * 
	 * @param hora   Las horas de una hora.
	 * @param minuto Los minutos de una hora.
	 */
	public Hora(int hora, int minuto) {
		// Comprobamos si las horas estan comprendidas entre 0 y 23, para que sean
		// validas.
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

		// Comprobamos si los minutos estan comprendidos entre 0 y 59, para que sean
		// validos.
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}

	/**
	 * Este metodo se encarga de añadir un minuto a nuestra hora.
	 */
	public void inc() {
		// Incrementamos un minuto.
		minuto++;

		// Comprobamos si el minuto es mayor de 59, si es así los minutos los
		// establecemos a 0 y incrementamos la hora en +1.
		if (minuto > 59) {
			minuto = 0;
			hora++;
		}

		// Comprobamos si la hora es mayor que 23, si es asi ponemos la hora a 0.
		if (hora > 23) {
			hora = 0;
		}
	}

	/**
	 * Esta función se encarga de modificar la hora con otra hora pasada como
	 * parametro.
	 * 
	 * @param hora La hora por la que vamos a cambiar la hora actual.
	 */
	public void setHora(int hora) {
		// Comprobamos si las horas estan comprendidas entre 0 y 23, para que sean
		// validas.
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

	}

	/**
	 * Esta función se encarga de modificar los minutos con otros minutos pasados
	 * como parametro.
	 * 
	 * @param minuto Los minutos por los que vamos a cambiar los minutos actuales.
	 */
	public void setMinuto(int minuto) {
		// Comprobamos si los minutos estan comprendidos entre 0 y 59, para que sean
		// validos.
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
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
		String solHora = "";

		// Comprobamos si la hora esta entre 0 y 9 para concatenarle un 0 delante, si no
		// solo se concatena la hora.
		if (hora >= 0 && hora <= 9) {
			solHora += "0" + hora + ":";
		} else {
			solHora += hora + ":";
		}

		// Comprobamos si los minutos estan entre 0 y 9 para concatenarle un 0 delante, si no
		// solo se concatena los minutos.
		if (minuto >= 0 && minuto <= 9) {
			solHora += "0" + minuto + ":";
		} else {
			solHora += minuto + ":";
		}

		// Devolvemos la cadena donde se almacena la hora.
		return solHora;
	}

}
