package part1.ejercicio2;

public class PrincipalEmpleado {

	public static void main(String[] args) {

		//Creamos un empleado de cada tipo para ver como se muestra su nombre.
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");

		//Imprimimos cada empleado.
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
		
	}

}
