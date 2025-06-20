
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        double num =  reader.nextDouble();

        try {
            imprimeNumeroPositivo(num);
            imprimeNumeroNegativo(num);
        } catch (NumeroNegativoException | NumeroPositivoException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static void imprimeNumeroPositivo(double num) throws NumeroNegativoException{
        if(num >= 0){
            System.out.println("El numero es: "+ num);
        }
        else{
            throw new NumeroNegativoException();
        }
    }

    public static void imprimeNumeroNegativo(double num) throws NumeroPositivoException{
        if(num < 0){
            System.out.println("El numero es: "+ num);
        }
        else{
            throw new NumeroPositivoException();
        }
    }

}
