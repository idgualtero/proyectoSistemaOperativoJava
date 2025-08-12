public class Archivo implements ElementoSistema{
    private String nombre;
    private int tamano;

    public Archivo (String nombre,int tamano){
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

     public void setTamano(int tamano){
        this.tamano = tamano;
    }

    public String getNombre(){
        return nombre;
    }

    public int getTamano(){
        return tamano;
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
