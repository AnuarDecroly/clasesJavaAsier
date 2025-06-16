
public class Perro extends Mascota{

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento,boolean pulgas, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;

        this.pulgas = pulgas;
        this.raza = raza;
    }

    
    public String getRaza() {
        return raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    @Override
    public String muestra() {
        return "Perro: Nombre = " + this.nombre + " Edad= " + this.edad + " Fecha Nacimiento= " + this.fechaNacimiento + " Estado= "+this.estado +
        "Raza= "+this.raza + "Pulgas= "+this.pulgas;
    }

    @Override
    public String habla() {
        return "Soy un perro y hago wauff wauff";
    }



    

}
