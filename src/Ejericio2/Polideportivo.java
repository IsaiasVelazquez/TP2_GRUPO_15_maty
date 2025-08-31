package Ejericio2;

public class Polideportivo implements I_InstalacionDeportiva, I_Edificio {

	private String nombre;
    private double superficie;
    private int tipo; 
    
    public Polideportivo(String nombre, double superficie, int tipo) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.tipo = tipo;
    }

    @Override
    public int getTipoDeInstalacion() {
        return tipo;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {

        return "El polideportivo con nombre " + nombre
             + ", tiene una superficie de " + superficie + " m²"
             + " y es de tipo " + tipo + ".";
    }
}


