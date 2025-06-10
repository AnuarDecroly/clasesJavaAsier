import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Persona pp = new Persona("Anuar","Khan-Ali","12345678T");

        pp.setDireccion("Mi casa");
        pp.setFechaNacimiento("07-05-1983");
        pp.setEdad(42);

        System.out.println(pp);
        System.out.println("¿Soy adulto?: "+pp.soyAdulto());

        Persona p3 = new Persona("Jose","Blanco","9876543Z");

        p3.setDireccion("Mi casa de verano");
        System.out.println(p3);
        System.out.println("¿Soy adulto?: "+p3.soyAdulto());

        Scanner reader = new Scanner(System.in);

        double [] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el numero " + (i+1));
            numeros[i] = reader.nextDouble();
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double suma = 0.0;
        double sumaP = 0.0;
        double sumaN = 0.0;

        for(int i = 0; i < numeros.length; i++){
            max = Math.max(max, numeros[i]);
            min = Math.min(min, numeros[i]);

            suma = suma + numeros[i];
            //suma += numeros[i];

            if(numeros[i] >= 0){
                sumaP += numeros[i];            
            }
            else{
                sumaN += numeros[i];
            }
        }

        System.out.println("El valor maximo es: "+ max);
        System.out.println("El valor minimo es: "+min);
        System.out.println("La suma es: "+suma);
        System.out.println("La media es: "+ (suma / numeros.length));
        System.out.println("La sumaP es: "+sumaP);
        System.out.println("La sumaN es: "+sumaN);

    }
}
