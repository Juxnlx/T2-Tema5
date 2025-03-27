package analisis.ej2;

import java.util.ArrayList;

public class PrincipalBiblio {

	public static void main(String[] args) {

		// Creamos un objeto de libro, revista y DVD.
		Ficha libro = new Libro(1, "La sombra del viento", "Carlos Ruiz Zafón", "Booket");
		Ficha revista = new Revista(2, "National Geographic", 250, 2023);
		Ficha dvd = new DVD(3, "Piratas del caribe: el cofre de la muerte", "Gore Verbinski", 2006, "PELICULA");

		// Creamos una lista para añadir este ejemplo de libro, revista y DVD.
		ArrayList<Ficha> biblioteca = new ArrayList<Ficha>();

		// Añadimos cada objeto a la lista biblioteca.
		biblioteca.add(libro);
		biblioteca.add(revista);
		biblioteca.add(dvd);

		System.out.println("BIBLIOTECA \n");
		
		// Recorremos cada objeto de la lista biblioteca.
		for (Ficha f : biblioteca) {
			// Imprimimos el titulo y el tiempo de préstamo de cada objeto.
			System.out.println("Titulo: " + f.getTitulo());
			System.out.println("Tiempo de préstamo: " + f.tiempoPrestamo() + " días");

			// Comprobamos si el objeto pertenece a la clase Libro mediante el metodo
			// instanceof, si es así hacemos un casteo a libro para poder usar los metodos
			// especificos de libro. Y asi con las demas opciones posibles.
			if (f instanceof Libro) {
				Libro l = (Libro) f;
				System.out.println("Autor: " + l.getAutor());
				System.out.println("Editorial: " + l.getEditorial());
			} else if (f instanceof Revista) {
				Revista r = (Revista) f;
				System.out.println("Número: " + r.getNumRevista());
				System.out.println("Año de publicación: " + r.getYearPublicacion());
			} else if (f instanceof DVD) {
				DVD d = (DVD) f;
				System.out.println("Director: " + d.getDirector());
				System.out.println("Año: " + d.getYear());
				System.out.println("Tipo de DVD: " + d.getTipoDVD());
			}

			System.out.println("---------------------");

		}
	}
}