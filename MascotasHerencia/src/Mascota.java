public abstract class  Mascota {

    //Una clase abstract no tiene constructor --> es decir no se puede instanciar objetos
    protected  String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    public abstract String muestra();

    public String cumple(){
        return this.fechaNacimiento;
    }

    public void morir(){
        this.estado = "muerto";
    }

    public abstract String habla();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


}
