// RONI COMPANOCCA CHECCO
// CUI: 20210558
// LABORATORIO 04
// FUNDAMENTOS DE PROGRAMACION
// GUARDAMOS EN UN ARRAYLIST LAS CARACTERES DEL SOLDADO
import java.util.ArrayList;
import java.util.Scanner;
class Ejercito {
    private String nombre;
    private ArrayList<Soldado> soldados;

    public Ejercito(String nombre) {
        this.nombre = nombre;
        this.soldados = new ArrayList<>();
    }

    public void agregarSoldado(Soldado soldado) {
        if (soldados.size() < 10) {
            soldados.add(soldado);
            System.out.println("Soldado agregado al ejército " + this.nombre + ".");
        } else {
            System.out.println("El ejército " + this.nombre + " ya tiene el máximo de soldados (10).");
        }
    }

    public void eliminarSoldado(Scanner scanner) {
        if (!soldados.isEmpty()) {
            System.out.println("Soldados en el ejército " + this.nombre + ":");
            for (int i = 0; i < soldados.size(); i++) {
                System.out.println((i + 1) + ". " + soldados.get(i).getNombre());
            }

            System.out.print("Selecciona el número del soldado a eliminar: ");
            int seleccion = scanner.nextInt();
            if (seleccion > 0 && seleccion <= soldados.size()) {
                soldados.remove(seleccion - 1);
                System.out.println("Soldado eliminado del ejército " + this.nombre + ".");
            } else {
                System.out.println("Número de soldado inválido.");
            }
        } else {
            System.out.println("El ejército " + this.nombre + " no tiene soldados para eliminar.");
        }
    }

    public void verEjercito() {
        System.out.println("Soldados en el ejército " + this.nombre + ":");
        if (soldados.isEmpty()) {
            System.out.println("El ejército no tiene soldados.");
        } else {
            for (Soldado soldado : soldados) {
                System.out.println("Nombre: " + soldado.getNombre() +
                        " - Ataque: " + soldado.getNivelAtaque() +
                        " - Defensa: " + soldado.getNivelDefensa() +
                        " - Vida: " + soldado.getVidaActual() +
                        " - Vive: " + soldado.isVive());
            }
        }
    }
}
