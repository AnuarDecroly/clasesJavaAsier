
import java.util.ArrayList;

public class Seccion {

    private String codigoSeccion;
    private int nEstanterias;
    private int planta;

    private ArrayList<Estanteria> estanterias;

    
    public Seccion(String codigoSeccion, int planta) {
        this.codigoSeccion = codigoSeccion;
        this.planta = planta;
    }

    public String getCodigoSeccion() {
        return codigoSeccion;
    }

    public int getnEstanterias() {
        return nEstanterias;
    }

    public int getPlanta() {
        return planta;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }


    public boolean insertarEstanteria(Estanteria e){
        //comprobar que no exista la estanteria
        boolean existe = false;
        if(this.estanterias.isEmpty()){
            this.estanterias.add(e);
        }else{
            for(Estanteria aux : this.estanterias){
                if(aux.getCodigo().equalsIgnoreCase(e.getCodigo())){
                    existe = true;
                }
            }

            if(existe == false){
                this.estanterias.add(e);
            }else{
                System.out.println("Ya existe la estanteria");
            }
        }

        return !existe;

    }

    @Override
    public String toString() {
        return "Seccion [codigoSeccion=" + codigoSeccion + ", nEstanterias=" + nEstanterias + ", planta=" + planta
                + "]";
    }

    public String mostrarEstanterias(){
        String info = "";
        if(this.estanterias.size() > 0){
            for (Estanteria est : this.estanterias) {
                info += est.toString() + "\n";
            }
        }
        else{
            info = "La seccion no tiene estanterias";
        }
        return info;
    }


}
