
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // FileWriter writer = null;
        // try {
        //     writer = new FileWriter("./datos.txt");
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }finally{
        //     try {
        //         writer.close();
        //     } catch (IOException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }


        String fileName = "./datos.txt";
        boolean append = true;


        //Escritura de fichero de texto plano
        try (FileWriter escritor = new FileWriter(fileName, append);
        PrintWriter printWriter = new PrintWriter(escritor)){ //true seguimos donde estaba el fichero false lo reinicia

            //Aqui escribir lo que queramos en el fichero: lista, texto
            printWriter.println("prod-001,patatas,1kg,5E");
            
            //Si usa printf
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }catch(IllegalFormatException e){
            System.out.println("El formato seleccionado no existe");

        }


        //Lectura de ficheros de texto plano
        String filePathToRead = "./datos.txt";

        ArrayList<String> lineas = new ArrayList();

        try (FileReader fileReader = new FileReader(filePathToRead);
        Scanner reader =  new Scanner(fileReader);) {
            while(reader.hasNext()){
                lineas.add(reader.nextLine());
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Tipo de dato incorrecto: "+e.getMessage());
        }
        catch(NoSuchElementException e){
            System.out.println("El fichero se ha terminado");
        }
        catch(Exception e){
            e.printStackTrace();
        }

        for (String elem : lineas) {
            System.out.println(elem);
            String [] elementos = elem.split(",");
        }
    }
}
