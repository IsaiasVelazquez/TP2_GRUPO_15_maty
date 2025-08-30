package Ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona implements Comparable<Empleado> {
	private final int legajo; // final, para que sea una variable que no se pueda modificar
	private String Puesto;
	private static int cont = 999; // PARA QUE EL 1ER LEG SEA 1000

	// constructor
	public Empleado() {
		super();
		cont++;
		this.legajo = cont;
	}

	public Empleado(String dni, String nombre, String apellido, LocalDate fechadenacimiento, String genero,
			String email, String direccion, String telefono, String puesto) {
		super(dni, nombre, apellido, fechadenacimiento, genero, email, direccion, telefono);
		cont++;
		this.legajo = cont;
		this.Puesto = puesto;
	}

	// METODO ESTATICO
	public static int devuelveProximoLegajo() {
		return cont + 1;
	}

	// GETTER Y SETTER
	public int getLegajo() {
		return legajo;
	}

	public String getPuesto() {
		return Puesto;
	}

	public void setPuesto(String puesto) {
		Puesto = puesto;
	}

	// metodo toString
	@Override
	public String toString() {
		return super.toString() + " Además, es empleado con legajo número " + legajo + " y ocupa el puesto de " + Puesto
				+ ".";
	}
	@Override
    public int compareTo(Empleado o) {
        return Integer.compare(this.getLegajo(), o.getLegajo()); 
    }
	//hashcode y equals 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Puesto, legajo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(Puesto, other.Puesto) && legajo == other.legajo;
	}
	

}
