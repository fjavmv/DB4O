package ejemploDb4o2;

public class Main2 {
    public static void main(String[] args) {
        Direccion mDireccion = new Direccion("1 primera calle", "San Jose");
        Clientes mClientes = new Clientes("Juana", mDireccion, "4089999999");
        Clientes mClientes2 = new Clientes("Juana", mDireccion, "4555599");
        Clientes mClientes3 = new Clientes("Perla", mDireccion, "4089999999");
        Db4o2.almacenar(mClientes);
        Db4o2.almacenar(mClientes2);
        Db4o2.almacenar(mClientes3);
        Db4o2.almacenar(mClientes);
        Db4o2.almacenar(mClientes2);
        Db4o2.almacenar(mClientes3);

        Clientes clientes =new Clientes();
        Db4o2.consultaEspecifica(clientes);


    }
}
