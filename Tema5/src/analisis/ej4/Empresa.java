package analisis.ej4;

public class Empresa extends Contacto {

	/**
	 * Creamos el atributo paginaWeb como String para almacenar la página web de una
	 * empresa.
	 */
	private String paginaWeb;

	/**
	 * Creamos el cosntructor con los atributos heredados de la clase padre
	 * (Contacto) y el atributo de la clase actual (Empresa).
	 * 
	 * @param nombre    El nombre de la empresa
	 * @param telefono  El telefono de la empresa.
	 * @param paginaWeb La paginaWeb de la empresa.
	 */
	public Empresa(String nombre, int telefono, String paginaWeb) {
		super(nombre, telefono);

		if (paginaWeb != null && !paginaWeb.isBlank()) {
			this.paginaWeb = paginaWeb;
		}
	}

	/**
	 * Esta función se encarga de devolver la página web de una empresa
	 * 
	 * @return La página web de una empresa.
	 */
	public String getPaginaWeb() {
		return paginaWeb;
	}

	/**
	 * Esta función se encarga de concatenar la información de la clase Contacto con
	 * la pagina web de la clase Empresa y la almacena en una variable de tipo
	 * cadena.
	 * 
	 * @return La cadena con toda la información de empresa.
	 */
	@Override
	public String toString() {
		String infoContacto = super.toString();

		infoContacto += " Página web: " + this.paginaWeb;

		return infoContacto;
	}
}
