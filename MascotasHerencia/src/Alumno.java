public class Alumno extends Persona{

    private String grado;
    private int curso;
    private String universidad;


    public Alumno(String nombre, String dni, String fNacimiento,
    String grado, int curso, String universidad) {
        super(nombre, dni, fNacimiento);
        this.curso = curso;
        this.grado = grado;
        this.universidad = universidad;
    }


    public String getGrado() {
        return grado;
    }


    public int getCurso() {
        return curso;
    }


    public String getUniversidad() {
        return universidad;
    }


    public void setGrado(String grado) {
        this.grado = grado;
    }


    public void setCurso(int curso) {
        this.curso = curso;
    }


    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    

}
