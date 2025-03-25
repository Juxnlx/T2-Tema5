package interfaz.ej1;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalSocio {

	public static void main(String[] args) {

		//Creamos una lista de socios para almacenar todos los socios posibles y ordenarlos segun su id.
		ArrayList<Socio> listaSocios = new ArrayList<Socio>();
		
		//Creamos algunos objetos de tipo socios.
		Socio s1 = new Socio(5, "Juan", 20);
		Socio s2 = new Socio(3, "Maria", 19);
		Socio s3= new Socio(1, "Manolo", 58);
		Socio s4 = new Socio(4, "Ana", 54);
	
		//Añadimos todos los socios creados a nuestra lista listaSocios.
		listaSocios.add(s1);
		listaSocios.add(s2);
		listaSocios.add(s3);
		listaSocios.add(s4);
		
		//Ordenamos la lista llamando al metodo sort de Collections.
		Collections.sort(listaSocios);
		
		//Recorremos la lista y vamos imprimiendo todos los socios.
		for (Socio socio: listaSocios) {
			System.out.println(socio);
		}

	}

}
