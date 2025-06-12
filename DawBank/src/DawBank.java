import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el nombre del titular");
        String titular = reader.next();
        
        String iban = MiUtils.comprobarPatronRepetidamente("[A-Z]{2}[0-9]{5}", "Introduzca el IBAN");

        CuentaBancaria cuenta =  new CuentaBancaria(titular, iban);

        
    }
}
