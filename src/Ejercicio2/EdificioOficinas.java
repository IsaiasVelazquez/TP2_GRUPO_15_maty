package Ejercicio2;

/*
Un edificio de oficinas es un edificio;
en Java interesa conocer el número de oficinas que tiene. 
*/

public class EdificioOficinas extends Edificio {
	
	public int numeroOficinas;

	public EdificioOficinas() {

		
	}

	public EdificioOficinas(double superficieEdificio, int numeroOficinas) {
		super(superficieEdificio);
		this.numeroOficinas = numeroOficinas;
	}

	public int getNumeroOficinas() {
		return numeroOficinas;
	}

	public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}
	
}
