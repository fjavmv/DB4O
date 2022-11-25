public class Estudiante {
    private String nombre;
    private String carrera;
    private int calificacion;

    public Estudiante(){
    }

    public Estudiante(String nombre, String carrera, int calificacion){
        this.nombre = nombre;
        this.carrera = carrera;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCalificacion() {
        return calificacion;
    }


    @Override
    public String  toString(){
        return nombre +" " + carrera +" " + calificacion;
    }

}
