import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Excepciones en tiempo de ejecucion
        System.out.println("Introduce radio de la circunferencia: ");
        String num = lector.nextLine();

        lector.close();

        int radio = -1;
        boolean isOk = true;

        try {

            radio = Integer.parseInt(num);

        } catch (NumberFormatException | ArithmeticException e) {

            System.out.println("Ha ocurrido una excepción de tiempo de ejecucion");
            System.out.println(e.getMessage());
            System.out.println("Se ha introducido un valor incorrecto, el radio tomara valor igual a 1");
            radio = 1;

        }finally{
                System.out.println("Radio: "+radio);
                System.out.println("Longitud: " + (2*Math.PI*radio));
                System.out.println("Area: " + (Math.PI*radio*radio));
                
                
        }


        //Excepciones comprobadas
        boolean isOpened = false;
        try {
            FileReader fichero = new FileReader("C:\\Users\\Anuar\\Documents\\GitHub\\datos.txt");
            isOpened = true;
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("No se ha podido abrir el fichero");
        }
        if(isOpened){
            System.out.println("El fichero ha sido abierto");
        }
        
        System.out.println("Fin del programa");


    }
}
