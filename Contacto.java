public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre.trim();
        this.apellido = apellido.trim();
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Dos contactos son iguales si nombre y apellido coinciden (sin mayúsculas)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contacto)) return false;

        Contacto c = (Contacto) obj;
        return nombre.equalsIgnoreCase(c.nombre) &&
                apellido.equalsIgnoreCase(c.apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

}
