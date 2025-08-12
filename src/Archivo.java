import java.util.List;

public class Archivo extends ElementoSistema{
    

    public Archivo (String nombre,int tamano){
        super(nombre, tamano);
    }
   
    @Override
    public boolean esDirectorio() {
        return false;
    }

    @Override
    public List<ElementoSistema> getFicheros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFicheros'");
    }
}
