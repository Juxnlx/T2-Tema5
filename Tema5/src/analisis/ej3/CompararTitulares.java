package analisis.ej3;

import java.util.Comparator;

public class CompararTitulares implements Comparator<Titular> {

	/**
	 * Compara dos titulares de cuentas bancarias basándose en sus apellidos. Si los
	 * apellidos son iguales, entonces los compara por nombre.
	 * 
	 * @param t1 El primer titular a comparar.
	 * @param t2 El segundo titular a comparar.
	 * @return Un valor negativo si el apellido de t1 es menor que el de t2, un
	 *         valor positivo si el apellido de t1 es mayor que el de t2, o 0 si los
	 *         apellidos son iguales, en cuyo caso se comparan los nombres del mismo modo.
	 */
	@Override
	public int compare(Titular t1, Titular t2) {
		// Creamos la variable sol como int para alamcenar el entero que nos devuelva el
		// compareTo.
		int sol;

		// Calculamos cual seria el entero que nos devuelve el compareTo al comparar los
		// apellidos de los dos titulares pasados como parametro.
		sol = t1.getApellidos().compareTo(t2.getApellidos());

		// Comprobamos si los apellidos son iguales, si es así hacemos la misma
		// comparación pero con el nombre y lo devolvemos.
		if (sol == 0) {
			sol = t1.getNombre().compareTo(t2.getNombre());
		}

		// Devolvemos la variable sol donde se almacena ese entero.
		return sol;
	}

}
