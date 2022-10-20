package paquete1;

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellidos, int edad, int dorsal, String posicion) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("El jugador con el dorsal: "+dorsal+", juega en la posicion: "+posicion);
    }

    @Override
    public void entrenamiento(){
        System.out.println("El jugador con el dorsal: "+dorsal+" Esta entrenando");
    }

    public void entrevista(){
        System.out.println("El jugador del dorsal: "+dorsal+" da una entrevista");
    }
}
