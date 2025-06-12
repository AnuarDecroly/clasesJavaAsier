public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private String editorial;
    private Genero genero;

    


    public Libro(String titulo, String autor, String isbn, int paginas, String editorial, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.editorial = editorial;
        this.genero = genero;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public Genero getGenero() {
        return this.genero;
    }


    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", paginas=" + paginas
                + ", editorial=" + editorial + ", genero=" + genero + "]";
    }

    

}
