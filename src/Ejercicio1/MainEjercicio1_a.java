package Ejercicio1;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean banderaCartel = false;

		Persona p1 = new Persona();
		p1.setDni("AA202020");

		Persona p2 = new Persona();
		p2.setDni("20202020");
		//p1
		try {
			// un poco de feedback
			if (Persona.exVerificarDNI(p1.getDni()))
				System.out.println("Persona agregada correctamente");
		} catch (ExVerificarDNI e) {
			System.out.println("Persona no agregada por no verificar el DNI");
			e.printStackTrace();
		}
		//p2
		try {
			if (Persona.exVerificarDNI(p2.getDni()))
				System.out.println("Persona agregada correctamente");
		} catch (ExVerificarDNI e) {
			System.out.println("Persona no agregada por no verificar el DNI");
			e.printStackTrace();
		}

	}

}
