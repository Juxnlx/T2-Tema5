package interfaz.ej1;

import java.util.Comparator;

public class CompararEdad implements Comparator<Socio> {

	/**
	 * Esta función se encarga de comparar las dos edades de los dos socios pasados
	 * como parametro. Restamos la edad del socio 2 a la del socio 1 para ordenarlos
	 * de forma creciente a decreciente.
	 * 
	 * @return positivo si el s2 es mayor, en caso contrario un número menor y si
	 *         devuelve 0 es que son iguales.
	 */
	@Override
	public int compare(Socio s1, Socio s2) {

		return s2.getEdad() - s1.getEdad();
	}

}
