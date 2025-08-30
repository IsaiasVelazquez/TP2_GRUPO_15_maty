package Ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;


public class MainEjercicio1_d {

	public static void main(String[] args) {
		
		//creamos 5 personas
		Persona p1= new Persona("11111111", "Lautaro", "Flor", LocalDate.of(1990, 5, 10), "M", "lautaro@gmail.com", "Calle 11", "1111");
        Persona p2= new Persona("22222222", "Marcos", "Montalto", LocalDate.of(1988, 3, 20), "M", "marcos@gmail.com", "Calle 12", "1212");
        Persona p3= new Persona("33333333", "Agustin", "Ayala", LocalDate.of(1995, 1, 15), "M", "agustin@gmail.com", "Calle 13", "1313");
        Persona p4= new Persona("44444444", "Cielo", "Guiraudo", LocalDate.of(1992, 7, 8), "F", "cielo@gmail.com", "Calle 14", "1414");
        Persona p5= new Persona("55555555", "Valentino", "Monje", LocalDate.of(1985, 11, 25), "M", "valentino@gmail.com", "Calle 15", "1515");

        // Guardamos en el hashset
        HashSet<Persona> personas = new HashSet<Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        // Mostramos con el iterator
        Iterator<Persona> it = personas.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
	}

}
