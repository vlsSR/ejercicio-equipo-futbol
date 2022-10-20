package paquete1;

public class Doctor extends Persona{
    private String titulacion;
    private int experiencia;

    public Doctor(String nombre, String apellidos, int edad, String titulacion, int experiencia) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public void partidoFutbol(){
        System.out.println("El doctor esta atento a las emergencias en el partido");
    }

    @Override
    public void entrenamiento(){
        System.out.println("El doctor esta atento a las emergencias en el entrenamiento");
    }

    public void curarLesion(){
        System.out.println("El doctor esta curando una lesion");
    }
}
