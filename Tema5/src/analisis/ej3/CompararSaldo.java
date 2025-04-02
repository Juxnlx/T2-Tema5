package analisis.ej3;

import java.util.Comparator;

public class CompararSaldo implements Comparator<CuentasBancarias> {

	/**
	 * Esta función compara dos cuentas bancarias por su saldo.
	 * 
	 * @param c1 El primer saldo a comparar.
	 * @param c2 El segundo saldo a comparar.
	 * @return Un valor positivo si el saldo c1 es menor que c2, un valor negativo
	 *         si es mayor, o 0 si son iguales.
	 */
	@Override
	public int compare(CuentasBancarias c1, CuentasBancarias c2) {
		return (int) (c2.getSaldo() - c1.getSaldo());
	}

}
