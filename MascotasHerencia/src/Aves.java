public abstract class Aves extends Mascota{

    private String pico;
    private boolean vuela;

    public String vuela(){
        if(this.vuela){
            return "Estoy volando";
        }
        else{
            return "No puedo volar";
        }
    }

}
