import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduzca el nombre del titular");
        String titular = reader.next();
        
        String iban = MiUtils.comprobarPatronRepetidamente("[A-Z]{2}[0-9]{5}", "Introduzca el IBAN");

        CuentaBancaria cuenta =  new CuentaBancaria(titular, iban);
        String option;

        do {
            System.out.println();
            System.out.println("Bienvenido a su APP de banca, ¿Que desea hacer?:");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingresar");
            System.out.println("6. Retirar");
            System.out.println("7. Movimientos");
            System.out.println("8. terminar");

            option = reader.next();

            switch(option){
                case "1":
                    System.out.println("Titular: " +cuenta.getTitular());
                    System.out.println("IBAN: "+cuenta.getIban());
                    System.out.println("Saldo actual: "+cuenta.getSaldo());
                    break;
                
                case "2":
                    System.out.println("IBAN: "+cuenta.getIban());
                    break;
                
                case "3":
                    System.out.println("Titular: " +cuenta.getTitular());
                    break;

                case "4":
                    System.out.println("Saldo actual: "+cuenta.getSaldo());
                    break;

                case "5":
                    reader = new Scanner(System.in);
                    System.out.println("Introduzca la cantidad a ingresar");
                    double ingreso = reader.nextDouble();
                    cuenta.ingresar(ingreso);
                    break;

                case "6":
                    reader = new Scanner(System.in);
                    System.out.println("Introduzca la cantidad a retirar");
                    double retirada = reader.nextDouble();
                    cuenta.retirar(retirada);
                    break;

                case "7":
                    System.out.println(cuenta.mostrarMovimientos());
                    break;
                
                case "8":
                    System.out.println("Se va a cerrar la aplicacion");
                    break;

                default:
                    System.out.println("Por favor, escoga una opcion adecuada del menu");
            }
        } while (option.equalsIgnoreCase("8") == false);

    }
}
