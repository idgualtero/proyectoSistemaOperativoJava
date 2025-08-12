import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ElementoSistema{
    private String nombre;
    private List <ElementoSistema> elementos  = new ArrayList<ElementoSistema>();

    public Carpeta (){
    }

    public Carpeta (String nombre){
        this.nombre = nombre;
    }
    
    public Carpeta (String nombre, ElementoSistema elementoSistema){
        this.nombre = nombre;
        this.elementos.add(elementoSistema);      
    }

    public Carpeta (String nombre, List <ElementoSistema> elementoSistema){
        this.nombre = nombre;  
        this.elementos = elementoSistema;      
    }


    public String getNombre(){
        String arbol ="";
         for (int i = 0; i<this.elementos.size();i++){
             arbol = arbol + " "+ elementos.get(i).getNombre();
       }
        return arbol;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    
    public int getTamano() {
        int tamanoTotal = 0;
       for (int i = 0; i<this.elementos.size();i++){
            tamanoTotal=tamanoTotal+elementos.get(i).getTamano();
       }
       return tamanoTotal;
    }


    public void agregarElemento (ElementoSistema elemento){
        elementos.add(elemento);
    }

    @Override
    public void imprimir(String indent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    @Override
    public void borrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrar'");
    }

    @Override
    public void renombrar(String nuevoNombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'renombrar'");
    }

    @Override
    public void mover(Carpeta nuevaUbicacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mover'");
    }
}
