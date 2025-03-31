package analisis.ej4;

public class Persona extends Contacto {

	/**
	 * Creamos el atributo fechaNacimiento como String para almacenar la fecha de
	 * nacimiento del contacto.
	 */
	private String fechaNacimiento;

	/**
	 * Creamos el cosntructor con los atributos heredados de la clase padre
	 * (Contacto) y el atributo de la clase actual (Persona).
	 * 
	 * @param nombre          El nombre de la persona
	 * @param telefono        El telefono de la persona.
	 * @param fechaNacimiento La fecha de nacimiento de la persona.
	 */
	public Persona(String nombre, int telefono, String fechaNacimiento) {
		super(nombre, telefono);

		if (fechaNacimiento != null && !fechaNacimiento.isBlank()) {
			this.fechaNacimiento = fechaNacimiento;
		}
	}

	/**
	 * Esta función se encarga de devolver la fecha de nacimiento de una persona.
	 * 
	 * @return La fecha de nacimiento.
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Esta función se encarga de concatenar la información de la clase Contacto con
	 * la fecha de nacimiento de la clase Persona y la alamcena en una variable de
	 * tipo cadena.
	 * 
	 * @return La cadena con toda la información de persona.
	 */
	@Override
	public String toString() {
		String infoContacto = super.toString();

		infoContacto += " Fecha de nacimiento: " + this.fechaNacimiento;

		return infoContacto;
	}
}
