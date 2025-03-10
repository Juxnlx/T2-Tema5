package part1.ejercicio1;

public class PrincipalHora {

	public static void main(String[] args) {

		// Creamos tres objetos con horas distintas.
		HoraExacta hora1 = new HoraExacta(23, 59, 58);
		HoraExacta hora2 = new HoraExacta(2, 29, 59);
		HoraExacta hora3 = new HoraExacta(2, 15, 2);

		// Incrementamos un segundo a cada hora.
		hora1.inc();
		hora2.inc();
		hora3.inc();

		// Imprimimos cada hora.
		System.out.println(hora1);
		System.out.println(hora2);
		System.out.println(hora3);

	}

}
