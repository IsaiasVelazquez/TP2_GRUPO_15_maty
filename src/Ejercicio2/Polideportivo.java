package Ejercicio2;


/*
Un polideportivo es al mismo tiempo una instalación deportiva y un edificio;
en Java interesa conocer la superficie que tiene y el nombre que tiene. 
*/


public class Polideportivo extends Edificio implements InstalacionDeportiva {
	
	private String nombre;
	private int TipoDeInstalacion;

	
	public Polideportivo() {
		
	}

	public Polideportivo(double superficieEdificio, int tipodeinstalacion, String nombre) {
		super(superficieEdificio);
		this.TipoDeInstalacion = tipodeinstalacion;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoDeInstalacion() {
		return TipoDeInstalacion;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		TipoDeInstalacion = tipoDeInstalacion;
	}
}
