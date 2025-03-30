package analisis.ej3;

public class Transaccion {
	/**
	 * Creamos el atributo dia como int para almacenar el dia de la transacción.
	 */
	private int dia;

	/**
	 * Creamos el atributo mes como int para almacenar el mes de la transacción.
	 */
	private int mes;

	/**
	 * Creamos el atributo year como int para almacenar el año de la transacción.
	 */
	private int year;

	/**
	 * Creamos el atributo concepto como String para almacenar el concepto de la
	 * transacción.
	 */
	private String concepto;

	/**
	 * Creamos el atributo importe como double para almacenar el importe de la
	 * transacción.
	 */
	private double importe;

	/**
	 * Creamos un constructor con todos los atributos de la clase actual
	 * (Transacción).
	 * 
	 * @param dia      El dia de la transacción.
	 * @param mes      El mes de la transacción.
	 * @param year     El año de la transacción.
	 * @param concepto El concepto de la transacción.
	 * @param importe  El importe de la transacción.
	 */
	public Transaccion(int dia, int mes, int year, String concepto, double importe) {
		if (dia >= 1 && dia <= 31) {
			this.dia = dia;
		}

		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}

		if (year > 0) {
			this.year = year;
		}

		if (concepto != null && !concepto.isBlank()) {
			this.concepto = concepto;
		}

		if (importe > 0) {
			this.importe = importe;
		}
	}

	/**
	 * Esta función se encarga de devolver el dia de la transacción.
	 * 
	 * @return El dia de la transacción.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Esta función se encarga de devolver el mes de la transacción.
	 * 
	 * @return El mes de la transacción.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Esta función se encarga de devolver el año de la transacción.
	 * 
	 * @return El año de la transacción.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Esta función se encarga de devolver el concepto de la transacción.
	 * 
	 * @return El concepto de la transacción.
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * Esta función se encarga de devolver el importe de la transacción.
	 * 
	 * @return El importe de la transacción.
	 */
	public double getImporte() {
		return importe;
	}

}
