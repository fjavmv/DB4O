package ejemploDb4o2;
public class Clientes {
    private String nombre;
    private Direccion direcion;
    private String telefono;
    public  Clientes(){

    }
    public Clientes(String nombre, Direccion direcion, String telefono)
    {
        this.nombre =nombre;
        this.direcion =direcion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDirecion() {
        return direcion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString(){
        return nombre + " " + direcion + " " + telefono;
    }
}
