public class MenorEdadException extends Exception{

    public MenorEdadException(){
        super("El cliente es menor de edad");
    }

    @Override
    public String toString()
    {
        return "Exception menor de Edad";
    }

}
