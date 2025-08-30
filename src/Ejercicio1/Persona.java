package Ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechadenacimiento; 
	private String genero;
	private String telefono;
	private String direccion;
	private String email;
	
	private static final DateTimeFormatter fechaform =
		    DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//constructores 
	public Persona() {
		nombre="sin nombre";
		fechadenacimiento = LocalDate.of(2025, 1, 1);
	}
	public Persona(String dni , String nombre , String apellido ,LocalDate fechadenacimiento,
					String genero , String email , String direccion , String telefono) 
	{
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechadenacimiento = fechadenacimiento;
		this.genero = genero;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//GETTERS Y SETTERS
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechadenacimiento() {
		return fechadenacimiento;
	}

	public void setFechadenacimiento(LocalDate fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}

	@Override
	public String toString() {
		return "La persona con DNI " + dni + " se llama " + nombre + " " + apellido +
		           ", nació el " + fechadenacimiento.format(fechaform) +
		           ", es de género " + genero +
		           ", vive en " + direccion +
		           ", su número de teléfono es " + telefono +
		           " y su correo electrónico es " + email + ".";
	}
	
	public static boolean exVerificarDNI (String dni) throws ExVerificarDNI
	{
		if(dni.length() != 8) { //.Length() RETORNA EL NUMERO DE CARACTERES (int)
			throw new ExVerificarDNI();
		}
		for (int i=0; i<dni.length(); i++) {
			if(!Character.isDigit(dni.charAt(i))) { //Character.isDigit() comprueba si el carácter en la posición i es un dígito
				throw new ExVerificarDNI();
			}
			
		}			
		return true;
	}
}
