package analisis.ej3;

public class CuentaAhorro extends CuentasBancarias {
	/**
	 * Creamos el atributo saldoMantenimiento como double para almacenar el saldo de
	 * mantenimiento.
	 */
	private double saldoMantenimiento;

	/**
	 * Creamos el atributo interesAnual como double para almacenar el interes anual.
	 */
	private double interesAnual;

	/**
	 * Creamos este constructor con todos los atributos de la clase padre
	 * (CuentasBancarias) y la clase hija (CuentaAhorro).
	 * 
	 * @param numCuenta          El número de una cuenta ahorro.
	 * @param saldo              El saldo de una cuenta de ahorro.
	 * @param titular            El titular de una cuenta ahorro.
	 * @param saldoMantenimiento El saldo de mantenimiento de una cuenta de ahorro.
	 * @param interesAnual       El interes anual de una cuenta de ahorro.
	 */
	public CuentaAhorro(String numCuenta, double saldo, Titular titular, double saldoMantenimiento,
			double interesAnual) {
		super(numCuenta, saldo, titular);

		if (saldoMantenimiento > 0) {
			this.saldoMantenimiento = saldoMantenimiento;
		}

		if (interesAnual > 0) {

		}
		this.interesAnual = interesAnual;
	}

	/**
	 * Esta función se encarga de modificar el saldo actual con el nuevo pasado como
	 * parametro que lo calculamos de la diferencia del saldo de la cuenta menos el
	 * saldo de mantenimiento.
	 */
	public void calcularSaldoNuevo() {
		double nuevoSaldo;

		if (getSaldo() >= saldoMantenimiento) {
			nuevoSaldo = (getSaldo() - this.saldoMantenimiento);
			setSaldo(nuevoSaldo);
		}
	}

	/**
	 * Esta función se encarga de calcular el nuevo saldo aplicando el interes anual
	 * pasado como parametro.
	 */
	public void aplicarInteres() {
		double nuevoSaldo;
		if (this.interesAnual > 0) {
			nuevoSaldo = getSaldo() * (1 + this.interesAnual / 100);
			setSaldo(nuevoSaldo);
		}
	}
}
