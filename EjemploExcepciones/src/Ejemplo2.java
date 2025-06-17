import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo2 {
    public static void main(String[] args) {
        try {
            ejecutarTarea1();
        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir el fichero");
        }

    }

    public static void ejecutarTarea1() throws FileNotFoundException{
        ejecutarTarea2();
    }

    public static void ejecutarTarea2() throws FileNotFoundException{
        FileReader fichero = new FileReader("C:\\Users\\Anuar\\Documents\\GitHub\\datos.txt");
        System.out.println("El fichero ha sido abierto correctamente");
    }

}
