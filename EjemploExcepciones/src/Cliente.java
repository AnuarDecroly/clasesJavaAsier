public class Cliente {

    private String nombre;
    private int edad;
    private String dni;

    
    public Cliente(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean entrarDisco() throws MenorEdadException{
        boolean entrar = false;
        if(this.edad >= 18){
            entrar = true;
        }
        else{
            throw new MenorEdadException();
        }
        return entrar;
    }

}
