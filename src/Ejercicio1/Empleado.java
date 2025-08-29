package Ejercicio1;

import java.time.LocalDate;


public class Empleado extends Persona {
	private final int legajo; //final, para que sea una variable que no se pueda modificar
	private String Puesto;
	private static int cont = 999; //PARA QUE EL 1ER LEG SEA 1000
	
	//constructor
	public Empleado() {
	    super();
	    cont++;
	    this.legajo = cont;
	}

	public Empleado(String dni , String nombre , String apellido , LocalDate fechadenacimiento , 
	 		String genero , String email , String direccion , String telefono , String puesto) {
	    super(dni, nombre, apellido, fechadenacimiento, genero, email, direccion, telefono);
	    cont++;
	    this.legajo = cont;
	    this.Puesto = puesto;
	}

	//METODO ESTATICO
	public static int devuelveProximoLegajo() {
		return cont+1;
	}

	//GETTER Y SETTER
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
		return super.toString() + " Además, es empleado con legajo número " + legajo +
		           " y ocupa el puesto de " + Puesto + ".";
	}
	
	
	
}
