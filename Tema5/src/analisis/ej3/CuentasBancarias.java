package analisis.ej3;

import java.util.HashSet;

public class CuentasBancarias implements Comparable<CuentasBancarias> {
	/**
	 * Creamos el atributo numCuenta como String para almacenar el número de una
	 * cuenta.
	 */
	private String numCuenta;

	/**
	 * Creamos el atributo saldo como double para almacenar el saldo de una cuenta.
	 */
	private double saldo = 0;

	/**
	 * Creamos un conjunto para almacenar los titulares de una cuenta bancaria.
	 */
	private HashSet<Titular> titulares = new HashSet<Titular>();

	/**
	 * Creamos un constructor con algunos atributos de la clase actual
	 * (CuentasBancarias).
	 * 
	 * @param numCuenta El número una cuenta bancaria.
	 * @param titular   El titular de una cuenta bancaria.
	 */
	public CuentasBancarias(String numCuenta, Titular titular) {

		if (numCuenta != null && !numCuenta.isBlank()) {
			this.numCuenta = numCuenta;
		}

		if (titular != null) {
			titulares.add(titular);
		}
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
	 * Esta función se encarga de modificar el saldo de la cuenta con el nuevo saldo
	 * pasado como parametro.
	 * 
	 * @param saldo El nuevo saldo.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Esta función se encarga de devolver los titulares que se encuentran en
	 * nuestro conjunto titulares.
	 * 
	 * @return Todos los objetos titulares del conjunto.
	 */
	public HashSet<Titular> getTitulares() {
		return titulares;
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
	 * Esta función se encarga de comprobar si el conjunto de titulares es menor de
	 * 3 y en ese caso añade a un nuevo titular a una cuenta.
	 * 
	 * @param t El nuevo titular de una cuenta.
	 * @return true si se ha añadido, false si no lo ha hecho.
	 */
	public boolean añadirTitular(Titular t) {
		boolean añadido = false;

		if (titulares.size() < 3 && !titulares.contains(t)) {
			this.titulares.add(t);
			añadido = true;
		}

		return añadido;
	}

	/**
	 * Esta función se encarga de elimianar el titular pasado como parametro,
	 * primero comprueba que halla mas de 1 titular en la cuenta y si es así lo
	 * elimina.
	 * 
	 * @param t El titular que hay que eliminar.
	 * @return true si lo ha eliminado, false si no lo ha hecho.
	 */
	public boolean eliminarTitular(Titular t) {
		boolean eliminado = false;

		if (titulares.size() > 1) {
			titulares.remove(t);
			eliminado = true;
		}

		return eliminado;
	}

	/**
	 * Compara esta cuenta con otro pasado por parametro basado en el número de
	 * cuenta.
	 * 
	 * @param La otra cuenta bancaria.
	 * @return Un valor negativo si esta cuenta tiene un número de cuenta menor
	 *         alfabeticamente, un valor positivo si es mayor, o 0 si son iguales
	 *         los números de cuenta.
	 */
	@Override
	public int compareTo(CuentasBancarias c) {

		return this.numCuenta.compareTo(c.numCuenta);
	}
}
