package analisis.ej4;

public class Persona extends Contacto {

	/**
	 * Creamos el atributo fechaNacimiento como String para almacenar la fecha de
	 * nacimiento del contacto.
	 */
	private String fechaNacimiento;

	public Persona(String nombre, int telefono, String fechaNacimiento) {
		super(nombre, telefono);
		
		if (fechaNacimiento != null && !fechaNacimiento.isBlank()) {
			this.fechaNacimiento = fechaNacimiento;
		}
	}

	
	
	
}
