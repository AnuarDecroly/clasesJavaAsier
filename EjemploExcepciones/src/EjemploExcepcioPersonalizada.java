public class EjemploExcepcioPersonalizada {
    public static void main(String[] args) {

        Cliente c = new Cliente("Anuar",13, "1232342Y");
        try {
            
            if(c.entrarDisco()){
                System.out.println("Estoy dentro");
            }
            
        } catch (MenorEdadException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

}
