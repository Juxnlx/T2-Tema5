package analisis.ej4;

public class PrincipalAgenda {

	public static void main(String[] args) {

		// Creamos una agenda telefonica.
		AgendaTelefonica agenda = new AgendaTelefonica();

		// Creamos varios contactos de persona y empresa.
		Persona p1 = new Persona("Mama", 644206229, "22/10/1971");
		Empresa e1 = new Empresa("Fontanería y Calefacción", 607446272, "FontaneriayCalefacciónJBC.com");

		// Añadimos estos contactos a la agenda haciendo una llamada a la función
		// añadirContacto.
		if (agenda.añadirContacto(p1)) {
			System.out.println("Este contacto ha sido añadido correctamente");
		} else {
			System.out.println("El contacto no se ha podido añadir a la agenda.");
		}

		if (agenda.añadirContacto(e1)) {
			System.out.println("Este contacto ha sido añadido correctamente.");
		} else {
			System.out.println("El contacto no se ha podido añadir a la agenda.");
		}

		// Salto de linea.
		System.out.println();

		// Imprimimos todos los contactos de nuestra agenda de contactos, para ello
		// llamamos a nuesta función listarContactos.
		agenda.listarContactos();

		// Eliminamos la empresa y para ello llamamos a la función eliminarContacto.
		if (agenda.eliminarContacto(e1)) {
			System.out.println("Este contacto ha sido elimiando correctamente.");
		} else {
			System.out.println("Este contacto no se ha podido eliminar de la agenda.");
		}

		// Salto de linea.
		System.out.println();

		// Imprimimos todos los contactos de nuestra agenda de contactos de neuvo para
		// ver si se ha eliminado.
		agenda.listarContactos();

	}

}
