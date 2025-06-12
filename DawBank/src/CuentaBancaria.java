
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CuentaBancaria {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private String titular;
    private String iban;
    private double saldo;
    private Movimiento [] movimientos;

    private int nMovimientos;


    public CuentaBancaria(String titular, String iban)
    {
        this.titular = titular;
        this.iban = iban;
        this.saldo = 0.0;
        this.movimientos = new Movimiento[100];
        this.nMovimientos = 0;
    }

    public CuentaBancaria(String titular, String iban, double saldo)
    {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
        this.movimientos = new Movimiento[100];
        this.nMovimientos = 0;
    }

    public String getTitular() {
        return this.titular;
    }

    public String getIban() {
        return this.iban;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Movimiento[] getMovimientos() {
        return this.movimientos;
    }

    public void ingresar(double cantidad){
        if(cantidad >= 3000){
            System.out.println("Ingreso superior a 3000€. Se notifica a Hacienda");
        }

        this.registrarMovimiento(cantidad, Tipo.Ingreso);

    }

    public void retirar(double cantidad){

        if((this.saldo-Math.abs(cantidad)) < -50){
            System.out.println("El saldo sería menor de -50€, no es posible realizar la retirada");
        } else if(this.saldo-Math.abs(cantidad) > -50){
            if(this.saldo-Math.abs(cantidad) >= -50 && this.saldo-Math.abs(cantidad) < 0){
                System.out.println("AVISO: El saldo es negativo");
            }

            this.registrarMovimiento(cantidad, Tipo.Retirada);

        
        }
    }

    public void registrarMovimiento(double cantidad, Tipo tipo){
        if(tipo.Ingreso == Tipo.Ingreso){
            this.saldo += Math.abs(cantidad);
        }
        else{
            this.saldo -= Math.abs(cantidad);
        }

        if(nMovimientos == 100){
            nMovimientos = 0;
        }

        this.movimientos[nMovimientos] = new Movimiento(LocalDateTime.now().format(formatter), tipo, Math.abs(cantidad));

        nMovimientos ++;

    }

    public String mostrarMovimientos(){
        String info = "";
        if(nMovimientos > 0){
            for(int i = 0; i < nMovimientos; i++){
                info += info + movimientos[i].toString() + "\n";
            }

        }else{
            info = "No hay movimientos en la cuenta bancaria";
        }
        
        return info;
    }
}
