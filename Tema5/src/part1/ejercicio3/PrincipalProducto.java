package part1.ejercicio3;

public class PrincipalProducto {

	public static void main(String[] args) {

		// Creamos todo tipo de producto de ejemplo.
		Productos p1 = new Productos("patatas", 3);
		Perecedero p2 = new Perecedero("Coca-Cola", 1.50, 3);
		Perecedero p3 = new Perecedero("Agua", 1.50, 2);
		Perecedero p4 = new Perecedero("Zumo", 1.50, 1);
		NoPerecedero p5 = new NoPerecedero("Macarrones", 2, "Pasta");

		// Y mostramos todos los datos de cada uno, junto con la función calcular.
		System.out.println(p1 + " | Cantidad total: " + p1.calcular(2));
		System.out.println(p2 + " | Cantidad total: " + p2.calcular(2));
		System.out.println(p3 + " | Cantidad total: " + p3.calcular(2));
		System.out.println(p4 + " | Cantidad total: " + p4.calcular(2));
		System.out.println(p5 + " | Cantidad total: " + p5.calcular(2));
	}

}
