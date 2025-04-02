package comparator.ej1;

import java.util.Comparator;

public class CompararNumeros implements Comparator<Integer> {

	/**
	 * Creamos la función copare que comparara dos numeros enteros pasados como
	 * parametro.
	 * 
	 * @return un positivo, negativo o 0 dependiendo de la resta de num2 menos num1.
	 */
	@Override
	public int compare(Integer n1, Integer n2) {

		return n2 - n1;
	}

}
