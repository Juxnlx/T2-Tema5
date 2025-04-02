package interfaz.ej2;

import java.util.Comparator;

public class CompararNumGoles implements Comparator<Futbolista> {

	/**
	 * Esta función se encarga de comparar los números de goles entre los dos
	 * futbolistas y devolverá la diferencia de goles entre uno y otro.
	 */
	@Override
	public int compare(Futbolista f1, Futbolista f2) {

		return f2.getNumGoles() - f1.getNumGoles();
	}

}
