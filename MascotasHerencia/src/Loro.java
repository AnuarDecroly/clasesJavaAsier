public class Loro extends Aves{

    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento,boolean habla, String origen) {
        this.habla = habla;
        this.origen = origen;

        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getOrigen() {
        return origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    @Override
    public String muestra() {
        return "Loro: Nombre = " + this.nombre + " Edad= " + this.edad + " Fecha Nacimiento= " + this.fechaNacimiento + " Estado= "+this.estado +
        "Origen= "+this.origen + "Habla= "+this.habla;
    }

    @Override
    public String habla() {
        if(this.habla){
            return "Hola!!!!!!";
        }
        else{
            return "peajj peajj";
        }
    }

}
