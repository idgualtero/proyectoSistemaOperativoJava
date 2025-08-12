public interface ElementoSistema {
    public abstract String getNombre();
    public abstract int getTamano();
    public abstract void imprimir(String indent);
    public abstract void borrar();
    public abstract void renombrar(String nuevoNombre);
    public abstract void mover(Carpeta nuevaUbicacion);
}
