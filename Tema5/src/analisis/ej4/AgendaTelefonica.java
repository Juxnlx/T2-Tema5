package analisis.ej4;

import java.util.HashSet;

public class AgendaTelefonica {

	/**
	 * Creamos un conjunto de contactos para almacenar los contactos necesarios.
	 */
	private HashSet<Contacto> agendaContactos;

	/**
	 * Creamos un constructor para inicializar el conjunto para evitar un
	 * NullPointerException.
	 */
	public AgendaTelefonica() {
		this.agendaContactos = new HashSet<Contacto>();
	}

	/**
	 * Esta función se encarga de añadir un contacto al conjunto de contactos
	 * haciendo uso del metodo add.
	 * 
	 * @param c El contacto que vamos a añadir al conjunto.
	 * @return true si se ha añadido, false si no lo ha hecho.
	 */
	public boolean añadirContacto(Contacto c) {
		return agendaContactos.add(c);
	}

	/**
	 * Esta función se encarga de eleiminar un contacto del conjunto de contactos
	 * haciendo uso del metodo remove.
	 * 
	 * @param c El contacto que vamos a eliminar del conjunto.
	 * @return true si se ha añadido, false si no lo ha hecho.
	 */
	public boolean eliminarContacto(Contacto c) {
		return agendaContactos.remove(c);
	}

	/**
	 * Esta función se encarga de imprimir todos los contactos que se encuentren en
	 * el conjunto agendaContactos.
	 */
	public void listarContactos() {
		System.out.println("AGENDA DE CONTACTOS");
		
		for (Contacto c : agendaContactos) {
			System.out.println(c);
			System.out.println("----------------------------------------------------------");
		}
		
		System.out.println();
	}
}
