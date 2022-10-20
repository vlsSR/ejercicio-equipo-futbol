package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner sc = new Scanner(System.in);
    static Persona futbolista1 = new Futbolista("Carlos", "Suarez", 21, 3, "Delantero");
    static Persona futbolista2 = new Futbolista("Juan", "Sanchez", 23, 4, "Centrocampista");
    static Persona entrenador = new Entrenador("Emilio", "Gutierrez", 34, "Defensiva");
    static Persona medico = new Doctor("Ramon", "Santos", 45, "Neurologo", 20);

    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        menu();
    }

    public static void menu() {
        int opcion;
        boolean repetir = true;
        do {
            System.out.println("\tMENU");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    viajarEquipo();
                    break;
                case 2:
                    entrenarEquipo();
                    break;
                case 3:
                    partidoFutbol();
                    break;
                case 4:
                    planificarEntrenamiento();
                    break;
                case 5:
                    entrevistar();
                    break;
                case 6:
                    curarLesiones();
                    break;
                case 7:
                    repetir = false;
                    break;
                default:
                    System.out.println("Error opcion no valida");
                    break;
            }
            System.out.println("");
        } while (repetir);
    }

    public static void viajarEquipo() {
        for (Persona equipo : persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo() {
        for (Persona equipo : persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol() {
        for (Persona equipo : persona) {
            System.out.println(equipo.getNombre() + " " + equipo.getApellidos() + " -> ");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamiento() {
        for (Persona equipo : persona) {
            if (equipo instanceof Entrenador) {
                ((Entrenador) equipo).planificarEntrenamiento();
                break;
            }
        }
    }

    public static void entrevistar() {
        for (Persona equipo : persona) {
            if (equipo instanceof Futbolista) {
                ((Futbolista) equipo).entrevista();
            }
        }
    }
    public static void curarLesiones() {
        for (Persona equipo : persona) {
            if (equipo instanceof Doctor) {
                ((Doctor) equipo).curarLesion();
            }
        }
    }
}