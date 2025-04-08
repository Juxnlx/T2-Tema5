package analisis.ej3;

public class NombreException extends Exception {
	@Override
	public String toString() {
		return "El nombre introducido no es valido.";
	}
	
	@Override
	public String getMessage() {
		return "El nombre introducido no es valido.";
	}
}

