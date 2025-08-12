import java.util.List;

public abstract class ElementoSistema {
    
    private String nombre;
    private int tamano;

    public ElementoSistema(String nombre) {
        super();
        this.nombre = nombre;
    }

    public ElementoSistema(String nombre, int tamano) {
        super();
        this.nombre = nombre;
        this.tamano = tamano;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }
     
    public abstract boolean esDirectorio() ;
    public abstract List<ElementoSistema> getFicheros();

    /*public abstract void imprimir(String indent);
    public abstract void borrar();
    public abstract void renombrar(String nuevoNombre);
    public abstract void mover(Carpeta nuevaUbicacion);*/
}
