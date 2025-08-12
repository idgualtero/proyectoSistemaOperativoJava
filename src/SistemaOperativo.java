import java.util.ArrayList;
import java.util.List;

public class SistemaOperativo {
    private Carpeta elementoSistema = new Carpeta();

    public void load (){
        elementoSistema.agregarElemento(new Archivo("Archivo1.txt",15));
        elementoSistema.agregarElemento(new Archivo("Archivo2.txt",10));
        elementoSistema.agregarElemento(new Archivo("Archivo3.txt",5));
        elementoSistema.agregarElemento(new Archivo("Archivo4.txt",25));
        elementoSistema.agregarElemento(new Carpeta("Carpeta1"));
        elementoSistema.agregarElemento(new Carpeta("Carpeta2", new Archivo("Arcivo5", 50)));
        List <ElementoSistema> ele = new ArrayList<ElementoSistema>();
        ele.add(new Archivo("Archivo6", 1));
        ele.add(new Archivo("Archivo7", 1));
        ele.add(new Archivo("Archivo8", 1));
        ele.add(new Archivo("Archivo9", 1));
        ele.add(new Archivo("Archivo10", 1));
        elementoSistema.agregarElemento(new Carpeta("Carpeta3", ele));

    }

    public void tamanoTotal(){
        System.out.println("El tamaño total es:" + elementoSistema.getTamano());
    }

    public void pintarArbol(){
        System.out.println(elementoSistema.getNombre());
    }


}
