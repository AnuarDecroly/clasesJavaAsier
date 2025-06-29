public class Persona {

    private String nombre;
    private String dni;
    private String fNacimiento;
    
    public Persona(String nombre, String dni, String fNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + ", fNacimiento=" + fNacimiento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    

}
