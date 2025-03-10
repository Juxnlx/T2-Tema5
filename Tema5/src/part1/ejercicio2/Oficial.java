package part1.ejercicio2;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}
	
	/**
	 * Esta función se encarga de almacenar en una variable los datos de un
	 * empleado mas los del operario y oficial.
	 * 
	 * @return La cadena con los datos del empleado.
	 */
	@Override
	public String toString() {
		// Creamos la variable solEmpleado como String para almacenar como mostrar los
		// datos del empleado.
		String solEmpleado = super.toString();

		// Incrementamos al empleado como operario.
		solEmpleado += " -> Oficial";

		// Devolvemos la cadena solEmpleado.
		return solEmpleado;
	}

}
