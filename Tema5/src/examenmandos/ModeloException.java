package examenmandos;

public class ModeloException extends Exception{
	
	@Override
	public String toString() {
		return "El modelo introducido no es valido";
	}
	
	@Override
	public String getMessage() {
		return "El modelo introducido no es valido";
	}
}
