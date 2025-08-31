package Ejericio2;

import java.util.ArrayList;
import java.util.Iterator;

public class mainEjercicio2 {

	public static void main(String[] args) {
		ArrayList<I_Edificio> lista = new ArrayList<>();

		// Polis
        lista.add(new Polideportivo("Poli Troncos", 1250.50, 1));
        lista.add(new Polideportivo("Poli Zorzal",  980,  2));
        lista.add(new Polideportivo("Poli Tigre", 1500, 3));

        //Edificios
        lista.add(new EdificioOficinas(12000.70, 78));
        lista.add(new EdificioOficinas(1750,  15));

        // Iterador
        Iterator<I_Edificio> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
