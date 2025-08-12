public class SistemaOperativo {
    private Carpeta carpeta1 = new Carpeta("Carpeta1");
    private Carpeta carpeta2 = new Carpeta("Carpeta2");
    private Carpeta carpeta3 = new Carpeta("Carpeta3");
    private int tamanoTotal = 0;

    public void load (){
        
        carpeta1.agregarElemento(new Archivo("Archivo1.txt",15));
        carpeta1.agregarElemento(new Archivo("Archivo2.txt",10));
        carpeta1.agregarElemento(new Archivo("Archivo3.txt",5));
        carpeta1.agregarElemento(new Archivo("Archivo4.txt",25));
        carpeta1.agregarElemento(new Carpeta("Carp1"));
       

        carpeta2.agregarElemento(new Archivo("Arch1.txt",5));
        carpeta2.agregarElemento(new Archivo("Arch2.txt",1));
        carpeta2.agregarElemento(new Archivo("Arch3.txt",5));
        carpeta2.agregarElemento(new Archivo("Arch4.txt",2));

        carpeta3.agregarElemento(new Archivo("Arch14.txt",50));
        carpeta3.agregarElemento(new Archivo("Arch24.txt",50));
        carpeta3.agregarElemento(new Archivo("Arch34.txt",50));
        carpeta3.agregarElemento(new Archivo("Arch44.txt",50));

        carpeta2.agregarElemento(carpeta3);

        System.out.println("Sistema de Archivos Cargado Carpeta1");
        pintarArbol(carpeta1);              
        tamanoTotal(carpeta1);
        System.out.println("Tamano total Carpeta1: " + tamanoTotal);
        

        System.out.println("Sistema de Archivos Cargado Carpeta2");
        pintarArbol(carpeta2); 
        tamanoTotal = 0;       
        tamanoTotal(carpeta2);
        System.out.println("Tamano total Carpeta2: "+ tamanoTotal);

        tamanoTotal = 0;
        tamanoTotal(carpeta3);
        System.out.println("Tamano total Carpeta3: " + tamanoTotal);

    }

    public void tamanoTotal(ElementoSistema elementoSistema){
        tamanoTotal += elementoSistema.getTamano();        
            if(elementoSistema.esDirectorio()) {
                for (ElementoSistema f:elementoSistema.getFicheros()) {                     
                    tamanoTotal(f);
                }
            }
    }

    public void pintarArbol(ElementoSistema elementoSistema){
        System.out.println(elementoSistema.getNombre());
            if(elementoSistema.esDirectorio()) {
                for (ElementoSistema f:elementoSistema.getFicheros()) {                     
                    pintarArbol(f);
                }
            }
    }


}
