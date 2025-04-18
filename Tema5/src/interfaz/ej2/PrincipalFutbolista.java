package interfaz.ej2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalFutbolista {

	public static void main(String[] args) {
		// Creamos una lista de futbolistas para almacenar todos los futbolista posibles
		// y ordenarlos segun su número de camiseta y si hay algun jugador con el mismo
		// número pues ordenamos por el nombre.
		ArrayList<Futbolista> listaFutb = new ArrayList<Futbolista>();

		// Creamos algunos objetos de tipo futbolista.
		Futbolista f1 = new Futbolista(5, "Juan", 20, 200);
		Futbolista f2 = new Futbolista(8, "Pepe", 19, 100);
		Futbolista f3 = new Futbolista(6, "Manolo", 30, 89);
		Futbolista f4 = new Futbolista(6, "Andres", 54, 72);

		// Añadimos todos los socios creados a nuestra lista listaFutb.
		listaFutb.add(f1);
		listaFutb.add(f2);
		listaFutb.add(f3);
		listaFutb.add(f4);

		// Ordenamos la lista por las edades
		Collections.sort(listaFutb, (a, b) -> {
			return a.getEdad() - b.getEdad();});
		System.out.println("ORDENADO POR EDAD");
		// Recorremos la lista y vamos imprimiendo todos los futbolistas.
		for (Futbolista futb : listaFutb) {
			System.out.println(futb);
		}

		// Ordenamos la lista por el número de goles.
		Collections.sort(listaFutb, (a, b) -> {
			return b.getNumGoles() - a.getNumGoles();});
		System.out.println("\nORDENADO POR NUMERO DE GOLES");
		// Recorremos la lista y vamos imprimiendo todos los futbolistas.
		for (Futbolista futb : listaFutb) {
			System.out.println(futb);
		}

	}

}
