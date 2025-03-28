package analisis.ej1;

public class Camion extends Vehiculos {
	/**
	 * Creamos el atributo pesoMax como double para almacenar el peso del camión.
	 */
	private double pesoMax;

	/**
	 * Creamos el atributo transportaMP como boolean para almacenar si transportan
	 * mercancias peligrosas o no.
	 */
	private boolean transportaMp;

	/**
	 * Creamos un constructor con todos los atributos heredados de la clase
	 * Vehiculos mas los propios de la clase Camion.
	 * 
	 * @param marca        La marca del camion.
	 * @param modelo       El modelo del camion.
	 * @param color        El color del camion.
	 * @param matricula    La matricula del camion.
	 * @param pesoMax      El peso maximo del camion.
	 * @param transportaMp Si lleva mercancias peligrosas o no.
	 */
	public Camion(String marca, String modelo, String color, String matricula, double pesoMax, boolean transportaMp) {
		super(marca, modelo, color, matricula);

		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}
	}

	/**
	 * Esta función se encarga de devolver el peso maximo de un camión.
	 * 
	 * @return El peso maximo de un camión.
	 */
	public double getPesoMax() {
		return pesoMax;
	}

	/**
	 * Esta función se encarga de devolver mediante un boleano si un camión
	 * transporta o no mercancias peligrosas.
	 * 
	 * @return true si transporta mercancias peligrosas, false en caso contrario.
	 */
	public boolean isTransportaMp() {
		return transportaMp;
	}

	/**
	 * Esta función se encarga de modificar si el camion transporta mercancias
	 * peligrosas o no.
	 * 
	 * @param transportaMp el valor boleano que nos indica si el camión lleva
	 *                     mercancias peligrosas o no.
	 */
	public void setTransportaMp(boolean transportaMp) {
		this.transportaMp = transportaMp;
	}

}
