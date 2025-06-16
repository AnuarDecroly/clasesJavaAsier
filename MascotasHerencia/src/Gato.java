public class Gato extends Mascota{

    private String color;
    private boolean pelolargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento,String color, boolean pelolargo) {
        this.color = color;
        this.pelolargo = pelolargo;

        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getColor() {
        return color;
    }

    public boolean isPelolargo() {
        return pelolargo;
    }

    public void setPelolargo(boolean pelolargo) {
        this.pelolargo = pelolargo;
    }

    @Override
    public String muestra() {
        return "Gato: Nombre = " + this.nombre + " Edad= " + this.edad + " Fecha Nacimiento= " + this.fechaNacimiento + " Estado= "+this.estado +
        "Color= "+this.color + "Pelo Largo= "+this.pelolargo;
    }

    @Override
    public String habla() {
        return "Soy un gato y hago miauu miauu";
    }



}
