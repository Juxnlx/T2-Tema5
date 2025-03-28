package analisis.ej1;

import java.util.Scanner;

public class PrincipalVehiculos {

	public static void main(String[] args) {
		// Crear un objeto de tipo Turismo.
		Turismo coche = new Turismo("Toyota", "Corolla", "Rojo", "1234ABC", 5, "PARTICULAR");

		// Creamos la variable velocidadFinal como int para almacenar cual es la
		// velocidad maxima que desea el usuario que alcanza el coche.
		int velocidadFinal;

		// creamos la variable segundos como int para almacenar el tiempo en el que
		// mantendremos una velocidad.
		int segundos;

		// Creamos el Scanner para leer los datos introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Arrancamos el coche.
		coche.arrancar();
		System.out.println("Coche arrancado.");

		// Le pedimos al usuario que introduzca cual es la velocidad final que desea
		// alcanzar.
		System.out.print("Introduce la velocidad final que deseas alcanzar --> ");
		velocidadFinal = sc.nextInt();

		// Llamamos a la función acelerar para ir imprimiendo como va acelerando el
		// coche.
		coche.acelerar(velocidadFinal);

		// Mantenemos la valocidad durante el tiempo introducido por el usuario.
		System.out.print("\n¿Cuantos segundos quieres mantener la velocidad? --> ");
		segundos = sc.nextInt();
		System.out.println("Manteniendo velocidad por " + segundos + " segundos...");

		// Simulación de tiempo.
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			System.out.println();
		}

		System.out.println("Tiempo de espera finalizado.");

		// Llamamos a la función frenar para ir imprimiendo como va desacelerando el
		// coche.
		coche.frenar(0);

		// Frenar el coche.
		coche.parar();
		System.out.println("Coche detenido.");

		// Apagar el motor.
		System.out.println("Motor apagado.");

		// Cierre de Scanner
		sc.close();
	}

}
