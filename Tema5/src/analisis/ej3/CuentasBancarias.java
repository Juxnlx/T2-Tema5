package analisis.ej3;

import java.util.ArrayList;

public class CuentasBancarias {
	/**
	 * Creamos el atributo numCuenta como String para almacenar el número de una
	 * cuenta.
	 */
	private String numCuenta;

	/**
	 * Creamos el atributo saldo como double para almacenar el saldo de una cuenta.
	 */
	private double saldo;

	/**
	 * Creamos una lista para almacenar los titulares de una cuenta bancaria.
	 */
	private ArrayList<Titular> titulares;

	/**
	 * Creamos un constructor con todos los atributos de la clase actual
	 * (CuentasBancarias).
	 * 
	 * @param numCuenta El número una cuenta bancaria.
	 * @param saldo     El saldo de una cuenta bancaria.
	 * @param titular   El titular de una cuenta bancaria.
	 */
	public CuentasBancarias(String numCuenta, double saldo, Titular titular) {

		if (numCuenta != null && !numCuenta.isBlank()) {
			this.numCuenta = numCuenta;
		}
		if (saldo >= 0) {
			this.saldo = 0;
		}

		// Creamos una lista al crear una cuenta para almacenar los titulares posibles.
		this.titulares = new ArrayList<Titular>();
		// Añadimos el primer titular.
		this.titulares.add(titular);
	}

	/**
	 * Esta función se encarga de devolver el número de una cuenta bancaria.
	 * 
	 * @return El núemero de la cuenta.
	 */
	public String getNumCuenta() {
		return numCuenta;
	}

	/**
	 * Esta función se encarga de devolver el saldo de una cuenta bancaria.
	 * 
	 * @return El saldo de una cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Esta función se encarga sumar al saldo de la cuenta la cantidad pasada como
	 * parametro, siempre y cuendo la cantidad sea positiva.
	 * 
	 * @param cant La cantidad a ingresar en cuenta.
	 * @return true si se ha efectuado el ingreso, false si no ha echo.
	 */
	public boolean ingresar(double cant) {
		boolean ingresoRealizado = false;

		if (cant > 0) {
			this.saldo += cant;
			ingresoRealizado = true;
		}

		return ingresoRealizado;
	}

	/**
	 * Esta función se encarga resta al saldo de la cuenta la cantidad pasada como
	 * parametro, siempre y cuando esa cantidad de dinero no se mayor que el saldo
	 * actual de la cuenta.
	 * 
	 * @param cant La cantidad ha retirar de la cuenta.
	 * @return true si se ha efectuado la retirada, false en caso contrario.
	 */
	public boolean retirar(double cant) {
		boolean retiradaRealizada = false;

		if ((this.saldo - cant) >= 0) {
			this.saldo -= cant;
			retiradaRealizada = true;
		}

		return retiradaRealizada;
	}

	/**
	 * Esta función se encarga de comprobar si la lista de titulares es menor de 3 y
	 * en ese caso añade a un nuevo titular a una cuenta.
	 * 
	 * @param t El nuevo titular de una cuenta.
	 * @return true si se ha añadido, false si no lo ha hecho.
	 */
	public boolean añadirTitular(Titular t) {
		boolean añadido = false;

		if (this.titulares.size() < 3) {
			this.titulares.add(t);
			añadido = true;
		}

		return añadido;
	}
	
	public boolean eliminarTitular() {
		
	}
	
	public Titular busquedaTitular(String dni) {
		
	}
}
