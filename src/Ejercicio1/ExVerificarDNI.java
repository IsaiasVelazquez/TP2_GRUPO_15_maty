package Ejercicio1;

public class ExVerificarDNI extends RuntimeException {

	public ExVerificarDNI() {
	}

	@Override
	public String getMessage() {
		return "Formato invalido de DNI";
	}

}
