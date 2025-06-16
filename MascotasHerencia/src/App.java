
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Perro p = new Perro("Hielo",6,"Vivo","10-5-2019", false,"Malamute");

        Gato g = new Gato("Teo",13,"Vivo","10-5-2015", "Negro",false);

        Loro l = new Loro("Tucan",15,"Vivo","10-5-2010", true,"Amazonas");

        Canario c = new Canario("Piolin",15,"Vivo","10-5-2010","amarillo", true);

        //System.out.println(p.muestra());

        //Polimorfismo
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(p);
        mascotas.add(c);
        mascotas.add(l);
        mascotas.add(g);

        for(Mascota m : mascotas){
            System.out.println(m.muestra());
            if(m instanceof Loro){
                Loro laux = (Loro) m; //casting - conversion de tipo
                System.out.println(laux.habla());
            }
        }
    }
}
