import Ejercicio1.Empleado;

/*
Un edificio es una construcción cubierta;
en Java interesa disponer de un método double getSuperficieEdificio(). 
*/

public class Edificio implements Comparable<Edificio> {
	
	public double SuperficieEdificio; //Supongamos que en metros cuadrados
	
	public Edificio() {
		super();
	}
	
	public Edificio(double superficieEdificio) {
		super();
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
		return "Edificio [SuperficieEdificio=" + SuperficieEdificio + "]";
	}

	@Override
	public int compareTo(Edificio o) {
	     return 0;
	}

}
