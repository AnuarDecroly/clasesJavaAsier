public class Canario extends Aves{

    private String color;
    private boolean canta;

    

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean canta) {
        this.color = color;
        this.canta = canta;

        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getColor() {
        return color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    @Override
    public String muestra() {
        return "Canario: Nombre = " + this.nombre + " Edad= " + this.edad + " Fecha Nacimiento= " + this.fechaNacimiento + " Estado= "+this.estado +
        "Color= "+this.color + "Canta= "+this.canta;
    }

    @Override
    public String habla() {
        if(this.canta){
            return "La la la la!!!!!!";
        }
        else{
            return "pio pio";
        }
    }

}
