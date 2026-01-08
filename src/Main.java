import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(); // tamaño por defecto 10
        int opcion;

        do {
            System.out.println("\n AGENDA TELEFÓNICA");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Modificar teléfono");
            System.out.println("6. Espacios libres");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    agenda.añadirContacto(new Contacto(nombre, apellido, telefono));
                }

                case 2 -> agenda.listarContactos();

                case 3 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    agenda.buscaContacto(nombre, apellido);
                }

                case 4 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    agenda.eliminarContacto(new Contacto(nombre, apellido, ""));
                }

                case 5 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String telefono = sc.nextLine();
                    agenda.modificarTelefono(nombre, apellido, telefono);
                }

                case 6 -> {
                    System.out.println("Espacios disponibles: " + agenda.espaciosLibres());
                }

                case 7 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }

}
