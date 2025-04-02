package analisis.ej3;

public class PrincipalCB {

	public static void main(String[] args) {

		// Creamos un objeto titular para una cuenta.
		Titular titular1 = new Titular("26597217V", "Juan Luis", "Barrionuevo Risquez", 644477061);
		Titular titular2 = new Titular("30790056W", "Juan Luis", "Barrionuevo Carrasco", 607446272);

		// Creamos una cuenta corriente con un saldo inicial de 1000 euros y un 2% de
		// comisión por transacción.
		CuentaCorriente cuenta = new CuentaCorriente("ES123456789", titular1, 2);

		// Agregamos titulares
		cuenta.añadirTitular(titular2);

		// Creamos tres transacciones.
		Transaccion t1 = new Transaccion(15, 3, 2025, "Compra en supermercado", 50.0);
		Transaccion t2 = new Transaccion(16, 3, 2025, "Pago de factura", 100.0);
		Transaccion t3 = new Transaccion(17, 3, 2025, "Transferencia recibida", 300.0);
		
		// Agregamos cada transacción a la cuenta.
		cuenta.agregarTransaccion(t1);
		cuenta.agregarTransaccion(t2);
		cuenta.agregarTransaccion(t3);

		// Imprimir los titulares de la cuenta
		System.out.println("Titulares de la cuenta:");
		for (Titular t : cuenta.getTitulares()) {
			System.out.println(t);
			System.out.println("------------------------------");
		}

		// Mostramos información de la cuenta antes de descontar las comisiones.
		System.out.println("Saldo inicial: " + cuenta.getSaldo());
		System.out.println("Número de transacciones realizadas: " + cuenta.getNumTransacciones());

		// Hacemos un ingreso de 1000 euros.
		System.out.println("Hacemos un ingreso de 1000$");
		cuenta.ingresar(1000);

		// Calculamos el coste total de las transacciones.
		double costeTotal = cuenta.calcularCosteTransacciones();
		System.out.println("Coste total de transacciones: " + costeTotal);

		// Aplicamos el coste de las transacciones al saldo.
		cuenta.setSaldo(cuenta.getSaldo() - costeTotal);

		// Mostramos el saldo final
		System.out.println("Saldo final después de comisiones: " + cuenta.getSaldo());
	}

}
