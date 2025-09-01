package Ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

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

	public static Boolean exVerificarDNI(String dni) throws ExVerificarDNI {

		final int CANT = 8; // el tamaño es fijo
		Boolean esDigito = true;
		Boolean cantDigito = true;

		if (dni == null)
			throw new ExVerificarDNI(); // verifico que no sea una cadena vacia
		dni = dni.trim(); // sacamos los espacios vacios principio-fin (un poco de lo visto en C#)

		if (dni.length() != CANT) {
			cantDigito = false; // cambio el estado si no tiene el tamaño
			throw new ExVerificarDNI();
		}
		for (int i=0; i<dni.length(); i++) {
			if(!Character.isDigit(dni.charAt(i))) { //Character.isDigit() comprueba si el carácter en la posición i es un dígito
				esDigito=false;
        throw new ExVerificarDNI();
			}
			
		}			
		return (esDigito && cantDigito);
	}

//Escucho sus opiniones, no creo que es el mejor método.
	//hashcode y equals 

	@Override
	public int hashCode() {
		return Objects.hash(apellido, direccion, dni, email, fechadenacimiento, genero, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(email, other.email)
				&& Objects.equals(fechadenacimiento, other.fechadenacimiento) && Objects.equals(genero, other.genero)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}
}
