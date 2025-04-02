package interfaz.ej1;

import java.util.Comparator;

public class CompararNombre implements Comparator<Socio> {

	/**
	 * Esta función se encarga de comparar los dos nombres de los objetos pasados
	 * como parametro.
	 * 
	 * @return si el nombre 1 va a entes que el nombre 2 un numero negativo, en caso
	 *         contrario devuelve un positivo. Si son iguales devuelve 0.
	 */
	@Override
	public int compare(Socio s1, Socio s2) {

		return s1.getNombre().compareTo(s2.getNombre());
	}

}
