package Ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet; 

public class MainEjercicio1_c {

	public static void main(String[] args) {
		
		
		Empleado em6 = new Empleado("11111111", "Juan", "Pérez", LocalDate.of(1990, 5, 10), "M", "juan@mail.com", "Calle 6", "6666", "Administrador");
		Empleado em7 = new Empleado("22222222", "Ana", "García", LocalDate.of(1988, 3, 20), "F", "ana@mail.com", "Calle 7", "7777", "Diseñadora");
		Empleado em8 = new Empleado("33333333", "Luis", "Martínez", LocalDate.of(1995, 1, 15), "M", "luis@mail.com", "Calle 8", "8888", "Field Support");
		Empleado em9 = new Empleado("44444444", "María", "López", LocalDate.of(1992, 7, 8), "F", "maria@mail.com", "Calle 9", "9999", "Gerente de IT");
		Empleado em10 = new Empleado("55555555", "Pedro", "Gómez", LocalDate.of(1985, 11, 25), "M", "pedro@mail.com", "Calle 10", "1010", "Gestor de Proyectos");
		
		Set<Empleado> empleados = new TreeSet<Empleado>();
		
		//creamos 5 empleados y los guardamos dentro del treeset 
        empleados.add(em6);
        empleados.add(em7);
        empleados.add(em8);
        empleados.add(em9);
        empleados.add(em10);
        
        //utilizamos el iterator para mostrar la info 
        //en la clase empleado ya puse para lo de Comparable 
        Iterator<Empleado> it = empleados.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

	}

}
