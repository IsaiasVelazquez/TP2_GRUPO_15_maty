package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/*
1. Crear una clase llamada mainEjercicio2, con el método main.
Dentro del mismo crear un ArrayList que contenga tres polideportivos y dos edificios de
oficinas y utilizando un iterator, recorrer la colección y mostrar los atributos de
cada elemento. 
*/

public class mainEjercicio2 {

	public static void main(String[] args) {
		

		List<Edificio> lista = new ArrayList<>();

		// Polis
        lista.add(new Polideportivo("Poli Troncos", 1250.50, 1));
        lista.add(new Polideportivo("Poli San Fernando",  980,  2));
        lista.add(new Polideportivo("Poli Tigre", 1500, 3));

        //Edificios
        lista.add(new EdificioOficinas(12000.70, 78));
        lista.add(new EdificioOficinas(1750,  15));

        // Iterador
        Iterator<Edificio> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("----------------------------");
	}
        }
}
