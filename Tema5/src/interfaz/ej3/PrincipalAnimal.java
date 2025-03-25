package interfaz.ej3;

public class PrincipalAnimal {

	public static void main(String[] args) {

		//Creamos un objeto de tipo perro y otro de tipo gato.
		Perro perro = new Perro("Nelly", "Chihuahua", 8, "Marrón");
		Gato gato = new Gato("Titines", "Abisinio", 1, "Negro");
		
		
		System.out.println("Funciones de un PERRO --> ");
		//Llamamos a los distintos metodos de perro para ver que hace cada uno.
		perro.comer();
		
		perro.hacerRuido();
		
		//Comprobamos si la función hacer caso nos devuelve true o false.
		if (perro.hacerCaso()) {
			System.out.println("Nelly es una perrita obediente");
		} else {
			System.out.println("Nelly ha pasado de nosotros");
		}
		
		perro.vacunar();
		
		perro.sacarPaseo();
		
		perro.dormir();
		
		
		//GATO
		System.out.println("\nFunciones de un GATO --> ");
		gato.comer();
		
		gato.hacerRuido();
		
		//Comprobamos si la función hacer caso nos devuelve true o false.
		if (gato.hacerCaso()) {
			System.out.println("Titines es una perrita obediente");
		} else {
			System.out.println("Titines ha pasado de nosotros");
		}
		
		gato.vacunar();
		
		gato.toserBolaPelo();
		
		gato.dormir();
	}

}
