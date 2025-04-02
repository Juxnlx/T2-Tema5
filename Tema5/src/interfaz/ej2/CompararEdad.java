package interfaz.ej2;

import java.util.Comparator;

public class CompararEdad implements Comparator<Futbolista> {

	/**
	 * Esta función se encarga de comparar las dos edades de los dos socios pasados
	 * como parametro. Devuelve un valor positivo negativo o 0 dependiendo de la
	 * diferencia entre f1 - f2.
	 */
	@Override
	public int compare(Futbolista f1, Futbolista f2) {

		return f1.getEdad() - f2.getEdad();
	}

}
