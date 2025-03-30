package analisis.ej3;

import java.util.ArrayList;

public class CuentaCorriente extends CuentasBancarias {
	/**
	 * Creamos el atributo porcertajeTransaccion como double para almacenar el
	 * porcertaje cobrado por transaccion.
	 */
	private double porcentajeTransaccion;

	/**
	 * Creamos el atributo numTransacciones como int para almacenar el número de
	 * transacciones.
	 */
	private int numTransacciones;

	/**
	 * Creamos una lista para almacenar las transacciones de una cuenta corriente.
	 */
	private ArrayList<Transaccion> transacciones;

	/**
	 * Creamos este constructor con todos los atributos de la clase padre
	 * (CuentasBancarias) y la clase hija (CuentaCorriente).
	 * 
	 * @param numCuenta             El número de la cuenta.
	 * @param saldo                 EL saldo de la cuenta.
	 * @param titular               El titular de la cuenta
	 * @param porcertajeTransaccion Porcentaje cobrado por cada transacción.
	 */
	public CuentaCorriente(String numCuenta, double saldo, Titular titular, double porcertajeTransaccion) {
		super(numCuenta, saldo, titular);
		if (porcertajeTransaccion > 0) {
			this.porcentajeTransaccion = porcertajeTransaccion;
		}

		this.numTransacciones = 0;
		this.transacciones = new ArrayList<>();
	}

	/**
	 * Agrega una nueva transacción a la cuenta.
	 * 
	 * @param transaccion Transacción a agregar.
	 * @return true si se agregó correctamente, false en caso contrario.
	 */
	public boolean agregarTransaccion(Transaccion transaccion) {
		boolean añadida = false;

		if (transaccion != null) {
			transacciones.add(transaccion);
			numTransacciones++;
			añadida = true;
		}
		return añadida;
	}

	/**
	 * Calcula el coste total de todas las transacciones aplicando el porcentaje de
	 * comisión.
	 * 
	 * @return Coste total de las transacciones.
	 */
	public double calcularCosteTransacciones() {
		double totalCoste = 0;
		for (Transaccion t : transacciones) {
			totalCoste += t.getImporte() * (porcentajeTransaccion / 100);
		}
		return totalCoste;
	}

	/**
	 * Esta función se encarga de devolver el porcentaje de la transacción.
	 * 
	 * @return El porcentaje de la transacción.
	 */
	public double getPorcentajeTransaccion() {
		return porcentajeTransaccion;
	}

	/**
	 * Esta función se encarga de devolver el número de la transacción.
	 * 
	 * @return El número de la transacción.
	 */
	public int getNumTransacciones() {
		return numTransacciones;
	}

}
