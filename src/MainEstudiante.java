import com.db4o.Db4o;

public class MainEstudiante {
    public static void main(String[] args) {

        Estudiante es1 = new Estudiante("Maria","Informatica", 6);
        Estudiante es2 = new Estudiante("Matilde","Informatica", 7);
        Estudiante es3 = new Estudiante("Monica","Informatica", 7);
        Estudiante es4 = new Estudiante("Maria Segunda","Informatica", 5);
        Estudiante es5 = new Estudiante("Maria Tercera","Informatica", 4);
        Estudiante es6 = new Estudiante("Pedro","Informatica", 9);

        MiDb4o db = new MiDb4o();

        db.guardar(es1);
        db.guardar(es2);
        db.guardar(es3);
        db.guardar(es4);
        db.guardar(es5);
        db.guardar(es6);

        System.out.println("Datos recuperados del la db.......");
        Estudiante e = new Estudiante();
        //db.consultar(new Estudiante("",null,0));
        db.consultar(e);
        db.cerrar();


    }
}
