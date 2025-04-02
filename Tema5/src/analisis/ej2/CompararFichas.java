package analisis.ej2;

import java.util.Comparator;

public class CompararFichas implements Comparator<Ficha> {

	/**
	 * Compara dos fichas de la biblioteca por su título en orden alfabético.
	 * 
	 * @param f1 La primera ficha a comparar.
	 * @param f2 La segunda ficha a comparar.
	 * @return Un valor negativo si el título de f1 es menor alfabéticamente que el
	 *         de f2, un valor positivo si es mayor, o 0 si son iguales.
	 */
	@Override
	public int compare(Ficha f1, Ficha f2) {
		return f1.getTitulo().compareTo(f2.getTitulo());
	}

}
