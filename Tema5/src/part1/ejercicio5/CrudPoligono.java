package part1.ejercicio5;

import java.util.HashSet;

public class CrudPoligono {

	// Creamos un conjunto para almacenar todos los poligonos creados.
	private static HashSet<Poligono> conjuntoPoli = new HashSet<Poligono>();

	/**
	 * Esta función se encarga de añadir el poligono pasado como parametro con el
	 * metodo add.
	 * 
	 * @param polig El poligono pasado como parametro.
	 * @return true si lo ha añadido, false si no lo ha hecho.
	 */
	public static boolean añadirPoligono(Poligono polig) {

		return conjuntoPoli.add(polig);
	}

	/**
	 * Esta función se encarga de recorrer todo el conjunto de poligonos y mostrar cada uno de ellos.
	 */
	public static void listarPoligonos() {

		for (Poligono poligono : conjuntoPoli) {
			System.out.println(poligono);
			System.out.println("Area: " + poligono.area());
			System.out.println("------------------------------------");
		}
	}
}
