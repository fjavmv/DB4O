import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oException;

public class MiDb4o {
    final String NOMBRE_DB = "estudiantes.yap";
    ObjectContainer db  = Db4oEmbedded.openFile(NOMBRE_DB);
 /*   private void abrir(){
        File file = new File(NOMBRE_DB);
        String ruta = file.getAbsolutePath();
        System.out.println("Conexión abierta....");
        //db = Db4o.openFile(ruta);
        db = Db4oEmbedded.openFile(ruta);
    }*/

    public void guardar(Estudiante estudiante){
        try{
           // abrir();
            db.store(estudiante);
            System.out.println("Datos almacenados: " + estudiante);
        }catch (Db4oException ex){
            System.out.println("Ha ocurrido un error........... " + ex.getMessage());
        }
    }

    public void  cerrar() {
        db.close();
        System.out.println("Se ha  cerrado la conexión........... ");
    }

    public void  consultar(Estudiante estudiante){
        ObjectSet<Estudiante> resultado  = db.queryByExample(estudiante);

        while (resultado.hasNext()){
            System.out.println(" ");
            System.out.println(resultado.next());
        }
    }


}
