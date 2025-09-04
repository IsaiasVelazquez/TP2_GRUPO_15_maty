package Ejercicio2;


/*
Un polideportivo es al mismo tiempo una instalación deportiva y un edificio;
en Java interesa conocer la superficie que tiene y el nombre que tiene. 
*/


public class Polideportivo extends Edificio implements InstalacionDeportiva {
	
	private String nombre;
	private int tipoDeInstalacion;

	
	public Polideportivo() {
		
	}

	public Polideportivo(String nombre,double superficieEdificio, int tipodeinstalacion ) {
		super(superficieEdificio);
		this.nombre = nombre;
		this.tipoDeInstalacion = tipodeinstalacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public String toString() {
	     return "Nombre del polideportivo '" + nombre+ "'\n"
	             + "con una superficie total de " + super.getSuperficieEdificio() + " m² \n"
	             + "Es de tipo " + tipoDeInstalacion + ".";
	}
	
}
