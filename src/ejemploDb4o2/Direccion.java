package ejemploDb4o2;

public class Direccion {
    private String calle;
    private String ciudad;
    public Direccion(String calle, String ciudad)
    {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString(){
        return calle + " " + ciudad;
    }
}
