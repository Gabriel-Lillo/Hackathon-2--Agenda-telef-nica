

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Agenda {
    private ArrayList<Contacto> contactos;
    private int tamanioMaximo;

    // Constructor por defecto
    public Agenda() {
        this(10);
    }

    // Constructor con tamaño definido
    public Agenda(int tamanioMaximo) {
        this.tamanioMaximo = tamanioMaximo;
        contactos = new ArrayList<>();
    }

    public boolean agendaLlena() {
        return contactos.size() >= tamanioMaximo;
    }

    public int espaciosLibres() {
        return tamanioMaximo - contactos.size();
    }

    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    public void añadirContacto(Contacto c) {

        if (c.getNombre().isEmpty() || c.getApellido().isEmpty()) {
            System.out.println("Nombre y apellido no pueden estar vacíos.");
            return;
        }

        if (agendaLlena()) {
            System.out.println("La agenda está llena.");
            return;
        }

        if (existeContacto(c)) {
            System.out.println("El contacto ya existe.");
            return;
        }

        contactos.add(c);
        System.out.println("Contacto agregado correctamente.");
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        Collections.sort(contactos, Comparator
                .comparing(Contacto::getNombre, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Contacto::getApellido, String.CASE_INSENSITIVE_ORDER));

        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    public void buscaContacto(String nombre, String apellido) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre) &&
                    c.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Teléfono: " + c.getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    public void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre) &&
                    c.getApellido().equalsIgnoreCase(apellido)) {
                c.setTelefono(nuevoTelefono);
                System.out.println("Teléfono actualizado.");
                return;
            }
        }
        System.out.println("El contacto no existe.");
    }

}
