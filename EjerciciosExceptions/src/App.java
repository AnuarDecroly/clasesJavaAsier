import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido: …”. Se deberá tratar la excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”.

        Scanner reader = new Scanner(System.in);

        int num = -1;
        try {
            System.out.println("Introduce un numero entero: ");
            num = reader.nextInt();
            System.out.println("El valor introducido es: "+num);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");
        } finally {
            System.out.println("Fin del programa");
        }


        // Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán tratar de forma independiente las dos posibles excepciones, InputMismatchException y ArithmeticException, mostrando en cada caso un mensaje de error diferente en cada caso.

        int num1 = -1;
        int num2 = -1;

        try {
            System.out.println("Introduce el num1: ");
            num1 = reader.nextInt();
            System.out.println("Introduce el num2: ");
            num2 = reader.nextInt();

            double div = num1 / num2;

            System.out.println("El cociente num1 / num2 es: "+div);
                        
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto");

        } catch(ArithmeticException e){
            System.out.println("No se puede divir entre cero");
        }
        
        finally {
            System.out.println("Fin del ejercicio");
        }

        
    }
}
