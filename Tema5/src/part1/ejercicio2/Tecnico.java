package part1.ejercicio2;

public class Tecnico extends Operario {

	/**
	 * Constructor heredado de la clase padre (Empleado).
	 * 
	 * @param nombre El nombre del empledo.
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Esta función se encarga de almacenar en una variable los datos de un empleado
	 * mas los del operario y tecnico.
	 * 
	 * @return La cadena con los datos del empleado.
	 */
	@Override
	public String toString() {
		// Creamos la variable solEmpleado como String para almacenar como mostrar los
		// datos del empleado.
		String solEmpleado = super.toString();

		// Incrementamos al empleado como operario.
		solEmpleado += " -> Tecnico";

		// Devolvemos la cadena solEmpleado.
		return solEmpleado;
	}

}
