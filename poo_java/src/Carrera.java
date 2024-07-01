public class Carrera {
    String nombre;
    int duracion;
    boolean  enCurso;

    public String estudianteOegresado(){
        String t;
        if (enCurso == true){
            t = "estudiante";
            return t;
        }
        t = "egresado";
        return t;
    }
}
