package tiendademascotas;

public class Mascotas {

    private int ID;

    private String nombre, tipo;

    public Mascotas(int ID, String nombre, String tipo) {

        this.ID = ID;

        this.nombre = nombre;

        this.tipo = tipo;

    }

    public int getID() {

        return this.ID;

    }

    public void setID(int ID) {

        this.ID = ID;

    }

    public String getNombre() {

        return this.nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getTipo() {

        return this.tipo;

    }

    public void setTipo(String tipo) {

        this.tipo = tipo;

    }

}
