package paquete1;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String nombre, String apellidos, int edad, String estrategia) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("El entrenador dirige el partido con su estrategia: "+estrategia);
    }

    @Override
    public void entrenamiento(){
        System.out.println("El entrenador dirige el entrenamiento con su estrategia: "+estrategia);
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador esta preparando el entrenamiento");
    }
}
