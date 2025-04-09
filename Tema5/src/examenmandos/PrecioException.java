package examenmandos;

public class PrecioException  extends Exception{
	
	@Override
	public String toString() {
		return "El precio introducido es incorrecto.";
	}
	
	@Override
	public String getMessage() {
		return "El precio introducido es incorrecto.";
	}
}