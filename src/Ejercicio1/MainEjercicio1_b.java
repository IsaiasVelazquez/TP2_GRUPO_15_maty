package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainEjercicio1_b {

	public static void main(String[] args) {

		Empleado em1 = new Empleado("11111111", "Jazmin", "Nicolin", LocalDate.of(2006, 1, 24), "F", "jazmin@gmail.com", "Calle 1", "1111", "Diseñadora");
		Empleado em2 = new Empleado("22222222", "Bruno", "Fondati", LocalDate.of(1988, 3, 20), "M", "bruno@gmail.com", "Calle 2", "2222", "Programador");
		Empleado em3 = new Empleado("33333333", "Matias", "Barrientos", LocalDate.of(1995, 1, 15), "M", "matias@gmail.com", "Calle 3", "3333", "Analista");
		Empleado em4 = new Empleado("44444444", "Marcos", "Parlangeli", LocalDate.of(1992, 7, 8), "M", "marcos@gmail.com", "Calle 4", "4444", "Tester");
		Empleado em5 = new Empleado("55555555", "Isaias", "Velazquez", LocalDate.of(1985, 11, 25), "M", "bruno@gmail.com", "Calle 5", "5555", "Soporte");
		
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		//creamos 5 empleados y los guardamos dentro del treeset 
        empleados.add(em1);
        empleados.add(em2);
        empleados.add(em3);
        empleados.add(em4);
        empleados.add(em5);
        

		
        //usamos el iterator para mostrar la info
        Iterator<Empleado> it = empleados.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

	}

}
