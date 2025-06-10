public class Movimiento {

    private static int registro = 0;

    private int id;
    private String fecha;
    private double cantidad;
    private Tipo tipo;


    public Movimiento(String fecha, Tipo tipo, double cantidad){
        this.id = registro;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;

        registro++;

    }

    public int getId() {
        return this.id;
    }

    public String getFecha() {
        return this.fecha;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    

}
