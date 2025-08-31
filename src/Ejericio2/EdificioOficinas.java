package Ejericio2;

public class EdificioOficinas implements I_Edificio {

	private double superficie;
    private int numeroOficinas;

    public EdificioOficinas(double superficie, int numeroOficinas) {
        this.superficie = superficie;
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    @Override
    public String toString() {

        return "El edificio de oficinas cuenta con una superficie de " + superficie + " m²"
             + " y tiene " + numeroOficinas + " oficinas.";
    }
}

