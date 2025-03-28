package analisis.ej3;

public class Titular {
	/**
	 * Creamos el atributo DNI como String para almacenar el DNI del titular de una
	 * cuenta.
	 */
	private String DNI;

	/**
	 * Creamos el atributo nombre como String para almacenar el nombre del titular
	 * de una cuenta.
	 */
	private String nombre;

	/**
	 * Creamos el atributo apellidos como String para almacenar los apellidos del
	 * titular de una cuenta.
	 */
	private String apellidos;

	/**
	 * Creamos el atributo telefono como int para almacenar el número de telefono
	 * del titular de una cuenta.
	 */
	private int telefono;

	/**
	 * Creamos un constructor con todos atributos de de la clase actual (Titular).
	 * 
	 * @param DNI       El DNI del titular.
	 * @param nombre    El nombre del titular.
	 * @param apellidos Los apellidos del titular.
	 * @param numero    El número de telefono del titular.
	 */
	public Titular(String DNI, String nombre, String apellidos, int telefono) {
		if (DNI != null && !DNI.isBlank()) {
			this.DNI = DNI;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (telefono >= 100000000 && telefono <= 999999999) {
			this.telefono = telefono;
		}
	}

	/**
	 * Esta función se encarga de devolver el DNI del titular de una cuenta.
	 * 
	 * @return El DNI del titular.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Esta función se encarga de devolver el nombre del titular de una cuenta.
	 * 
	 * @return El nombre del titular.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Esta función se encarga de devolver los apellidos del titular de una cuenta.
	 * 
	 * @return Los apellidos del titular.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Esta función se encarga de devolver el número de telefono del titular de una
	 * cuenta.
	 * 
	 * @return El número de telefono del titular.
	 */
	public int getTelefono() {
		return telefono;
	}

}
