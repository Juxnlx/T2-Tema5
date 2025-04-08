package analisis.ej3;

public class SaldoException extends Exception {
	@Override
	public String toString() {
		return "El dni introducido no es valido.";
	}
	
	@Override
	public String getMessage() {
		return "El dni introducido no es valido.";
	}
}

