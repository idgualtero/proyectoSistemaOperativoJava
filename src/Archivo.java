import java.util.ArrayList;
import java.util.List;

public class Archivo extends ElementoSistema{
    
    private List <ElementoSistema> elementos  = new ArrayList<ElementoSistema>();

    public Archivo (String nombre,int tamano){
        super(nombre, tamano);
    }
   
    @Override
    public boolean esDirectorio() {
        return false;
    }

    @Override
     public List<ElementoSistema> getFicheros() {
        return this.elementos;
    }
}
