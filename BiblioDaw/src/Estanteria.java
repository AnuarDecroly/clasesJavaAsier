import java.util.ArrayList;

public class Estanteria {

    private Seccion seccion;
    private String codigo;
    private Genero genero;
    private int nLibros;

    private ArrayList<Libro> librosEstanteria;

    
    public Estanteria(Seccion seccion, String codigo, Genero genero) {
        this.seccion = seccion;
        this.codigo = codigo;
        this.genero = genero;
        this.nLibros = 0;
        this.librosEstanteria = new ArrayList<>();
    }

    public Seccion getSeccion() {
        return this.seccion;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public int getnLibros() {
        return this.nLibros; // o esto this.librosEstanteria.size();
    }

    public ArrayList<Libro> getLibrosEstanteria() {
        return this.librosEstanteria;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
        this.librosEstanteria = new ArrayList<Libro>();
    }

    public void insertaLibroEstanteria(Libro libro){
        if(libro.getGenero() == this.genero){
            //Se podria comprobar si esta repetido o no
            boolean existe = false;

            for(Libro l : this.librosEstanteria){
                if(l.getIsbn().equalsIgnoreCase(libro.getIsbn())){
                    existe = true;
                }
            }

            if(existe){
                System.out.println("El libro ya esta en la estanteria");
            }else{
                this.librosEstanteria.add(libro);
                this.nLibros = this.librosEstanteria.size();
            }

        }else{
            System.out.println("No se puede insertar el libro en esta estanteria");
        }
    }

    public boolean eliminarLibroEstanteria(Libro libro){
        boolean status = false;
        if(libro.getGenero() == this.genero){
            status = this.librosEstanteria.remove(libro);
            this.nLibros = this.librosEstanteria.size();
        }else{
            System.out.println("El genero del libro no coincide con la estanteria");
        }
        return status;
    }

    @Override
    public String toString() {
        return "Estanteria [seccion=" + seccion.getCodigoSeccion() + ", codigo=" + codigo + ", genero=" + genero + ", nLibros=" + nLibros
                + "]";
    }

    public String mostrarLibrosEstanteria(){
        String info = "";
        if(this.librosEstanteria.size() > 0){

            for(Libro lib : this.librosEstanteria){
                info += lib.toString() + "\n";
            }

        }else{
            info = "No hay libros guardados en la estanteria";
        }

        return info;
    }

    
}
