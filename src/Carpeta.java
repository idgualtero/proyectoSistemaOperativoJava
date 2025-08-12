import java.util.ArrayList;
import java.util.List;

public class Carpeta extends ElementoSistema{
    
    private List <ElementoSistema> elementos  = new ArrayList<ElementoSistema>();

    /*public Carpeta (){
    }*/

    public Carpeta (String nombre, int tamano){
        super(nombre, tamano);

    }
    
    /*public Carpeta (String nombre, ElementoSistema elementoSistema){
        this.nombre = nombre;
        this.elementos.add(elementoSistema);      
    }

    public Carpeta (String nombre, List <ElementoSistema> elementoSistema){
        this.nombre = nombre;  
        this.elementos = elementoSistema;      
    }*/


    
    public void agregarElemento (ElementoSistema elemento){
        elementos.add(elemento);
    }


   
    @Override
    public boolean esDirectorio() {
        return true;
    }

    @Override
    public List<ElementoSistema> getFicheros() {
        return this.elementos;
    }
}
