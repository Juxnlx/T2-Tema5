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

		// Acelerar progresivamente
		while (coche.getVelocidadActual() < velocidadFinal) {
			// Incrementa la velocidad según la marcha actual.
			coche.ajustarVelocidad(); 

			// Subir marchas conforme aumente la velocidad
			if (coche.getVelocidadActual() >= 30 && coche.getMarchaActual() < 2) {
				coche.subirMarcha();
			}
			if (coche.getVelocidadActual() >= 50 && coche.getMarchaActual() < 3) {
				coche.subirMarcha();
			}
			if (coche.getVelocidadActual() >= 70 && coche.getMarchaActual() < 4) {
				coche.subirMarcha();
			}
			if (coche.getVelocidadActual() >= 100 && coche.getMarchaActual() < 5) {
				coche.subirMarcha();
			}
		}

		// 🚗 Mensaje de que se alcanzó la velocidad deseada
		System.out.println("🚗 Se ha alcanzado la velocidad objetivo de " + velocidadFinal + " km/h.");

		// Mantenemos la valocidad durante el tiempo introducido por el usuario.
		System.out.print("\n¿Cuantos segundos quieres mantener la velocidad? --> ");
		segundos = sc.nextInt();
		System.out.println("Manteniendo velocidad por " + segundos + " segundos...");
		System.out.println("Tiempo de espera finalizado.");

		// Frenar el coche.
		coche.parar();
		System.out.println("Coche detenido.");

		// Apagar el motor.
		System.out.println("Motor apagado.");
		
		//Cierre de Scanner
		sc.close();
	}

}
