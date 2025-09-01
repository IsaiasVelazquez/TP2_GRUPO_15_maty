package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

import Ejercicio1.Empleado;

/*
1. Crear una clase llamada mainEjercicio2, con el método main.
Dentro del mismo crear un ArrayList que contenga tres polideportivos y dos edificios de
oficinas y utilizando un iterator, recorrer la colección y mostrar los atributos de
cada elemento. 
*/

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		//Creamos el ArrayList
		ArrayList<Edificio> lista = new ArrayList<Edificio>();
		
		//Creamos los Objetos que pide el enunciado
		Polideportivo PolideportivoUno = new Polideportivo(1000,2,"Polideportivo Uno, Central");
		Polideportivo PolideportivoDos = new Polideportivo(600,2,"Polideportivo Dos, Municipal");
		Polideportivo PolideportivoTres = new Polideportivo(400,2,"Polideportivo Tres, Seccional Pacheco");
		EdificioOficinas ComplejoUno = new EdificioOficinas(700,40);
		EdificioOficinas ComplejoDos = new EdificioOficinas(360,20);
		
		//Agregamos los objetos al ArrayList
		lista.add(PolideportivoUno);
		lista.add(PolideportivoDos);
		lista.add(PolideportivoTres);
		lista.add(ComplejoUno);
		lista.add(ComplejoDos);
		
		//Usamos el Iterator para recorrer el ArrayList y Mostrar los Objetos
        Iterator<Edificio> it = lista.iterator();
        
        //Creamos el Ciclo While
        while(it.hasNext()) {
        	
            Edificio ed = it.next();
            
            System.out.println("Superficie: " + ed.getSuperficieEdificio());
            
            //Mostramos los atributos específicos de cada tipo usando instanceof
            
            if(ed instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) ed;
                System.out.println("Nombre: " + poli.getNombre());
                System.out.println("Tipo de instalación: " + poli.getTipoDeInstalacion());
            } 
            
            else if(ed instanceof EdificioOficinas) {
                EdificioOficinas oficinas = (EdificioOficinas) ed;
                System.out.println("Cantidad de oficinas: " + oficinas.getNumeroOficinas());
            }
            
            System.out.println("----------------------------");
        }
	}
}
