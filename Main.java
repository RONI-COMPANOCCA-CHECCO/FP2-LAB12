// RONI COMPANOCCA CHECCO
// CUI: 20210558
// LABORATORIO 048
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ejercito ejercito1 = new Ejercito("Ejército 1");
        Ejercito ejercito2 = new Ejercito("Ejército 2");

        // Agregar soldados a los ejércitos (puedes hacerlo dinámicamente o con datos predefinidos)
        ejercito1.agregarSoldado(new Soldado("Soldado1", 10, 5, 100, true));
        ejercito1.agregarSoldado(new Soldado("Soldado2", 8, 6, 90, true));
        ejercito2.agregarSoldado(new Soldado("Soldado3", 12, 4, 110, true));
        ejercito2.agregarSoldado(new Soldado("Soldado4", 9, 7, 95, true));

        Ejercito ejercitoSeleccionado = null;
        boolean continuar = true;

        while (continuar) {
            mostrarMenuPrincipal();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear Soldado
                    if (ejercitoSeleccionado != null) {
                        Soldado nuevoSoldado = crearSoldado(scanner);
                        ejercitoSeleccionado.agregarSoldado(nuevoSoldado);
                    } else {
                        System.out.println("Primero selecciona un ejército.");
                    }
                    break;
                case 2:
                    // Eliminar Soldado
                    if (ejercitoSeleccionado != null) {
                        ejercitoSeleccionado.eliminarSoldado(scanner);
                    } else {
                        System.out.println("Primero selecciona un ejército.");
                    }
                    break;
                case 8:
                    // Ver ejército
                    if (ejercitoSeleccionado != null) {
                        ejercitoSeleccionado.verEjercito();
                    } else {
                        System.out.println("Primero selecciona un ejército.");
                    }
                    break;
                case 12:
                    // Salir
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 12.");
                    break;
            }
        }
        scanner.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("Seleccione una opción:");
        System.out.println("1) Crear Soldado");
        System.out.println("2) Eliminar Soldado");
        System.out.println("8) Ver ejército");
        System.out.println("12) Salir");
    }

    private static Soldado crearSoldado(Scanner scanner) {
        System.out.println("Ingresa los detalles del nuevo soldado:");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Nivel de Ataque: ");
        int nivelAtaque = scanner.nextInt();
        System.out.print("Nivel de Defensa: ");
        int nivelDefensa = scanner.nextInt();
        System.out.print("Vida Actual: ");
        int vidaActual = scanner.nextInt();
        System.out.print("¿Vive? (true/false): ");
        boolean vive = scanner.nextBoolean();

        return new Soldado(nombre, nivelAtaque, nivelDefensa, vidaActual, vive);
    }
}