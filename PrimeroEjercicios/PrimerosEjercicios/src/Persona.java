public class Persona {

    /*
     * Modificadores de acceso o visibilidad clases, metodos y variables:
     * Public: Siempre es visible
     * Private: Solo es visible desde dentro de la propia clase
     * Protected: Solo es visible dentro de la propia clase o de sus hijos
     * Vacio: es visible para la clase y el package donde esta
     */

    /*
      * Metodos: funciones
      * Devuelven valores: int, double, boolean, String o objetos
      * No devuelven nada: se usa el modificador void
      */

    //Atributos o campos de una clase --> Encapsulamiento
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String fechaNacimiento;
    private int edad;

    //Crear propiedades

    public Persona(String nombre, String apellidos, String dni,String direccion, String fechaNacimiento, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;

    }

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Persona(){
        this.dni = "12345678X";
    }


    public String getDni(){
        return this.dni;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void happyBirthday(){
        this.edad++;
    }

    public boolean soyAdulto(){
        boolean adulto = false;
        if(this.edad >= 18){
            adulto = true;
        }
        return adulto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", dni=").append(dni);
        sb.append(", direccion=").append(direccion);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    
}
