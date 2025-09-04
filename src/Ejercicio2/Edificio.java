package Ejercicio2;

/*
Un edificio es una construcción cubierta;
en Java interesa disponer de un método double getSuperficieEdificio(). 
*/

public class Edificio  {
	
	private double SuperficieEdificio; //Supongamos que en metros cuadrados
	
	public Edificio() {
	}
	
	public Edificio(double superficieEdificio) {
		SuperficieEdificio = superficieEdificio;
	}
	
	public double getSuperficieEdificio() {
		return SuperficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		SuperficieEdificio = superficieEdificio;
	}

	@Override
	public String toString() {
		return "Superficie = " + SuperficieEdificio;
	}

}
