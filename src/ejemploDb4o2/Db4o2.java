package ejemploDb4o2;

import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.io.File;

public class Db4o2 {


    public static void almacenar(Clientes clientes){
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        boolean ok;
        try{
            db.store(clientes); //alamacenamos clientes
            System.out.println("Datos almacenados.....");
        } finally{
            // cerramos base de datos
            ok= db.close();
            System.out.println("Cerrado.....");
        }
    }

    private static String crearArchivo(){
        final String NOMBRE_ARCHIVO = "clientes.db4o";
        boolean ok;
        String rutaAbsoluta = " ";
        try{
            // abrimos archivo de db - base de datos representada por la interface ObjectContainer
            File miArchivo = new File(NOMBRE_ARCHIVO);
            rutaAbsoluta = miArchivo.getAbsolutePath();
            if (miArchivo.exists()){
                //ok = miArchivo.delete();
                System.out.println("El archivo ya existe..");
            }else{
                ok  = miArchivo.createNewFile();
                System.out.println("Archivo creado");
            }

        }catch (Exception ex){
            System.out.println("NO se pudo crear el archivo"+ ex.getMessage());
        }
        return rutaAbsoluta;
    }

    public static void  consultar(Clientes clientes){
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        ObjectSet<Clientes> resultado  = db.queryByExample(clientes);
        while (resultado.hasNext()){
            System.out.println(" ");
            System.out.println(resultado.next());
        }
    }

    public static void  consultaEspecifica(Clientes clientes){
        ObjectContainer db = Db4oEmbedded.openFile(crearArchivo());
        ObjectSet<Clientes> resultado  = db.queryByExample(clientes);
        Direccion direccion;
        Clientes c;
        while (resultado.hasNext()){
            System.out.println(" ");
            c = resultado.next();
           // System.out.println(c);
            direccion = c.getDirecion();
            System.out.println(direccion);
        }
    }

}
