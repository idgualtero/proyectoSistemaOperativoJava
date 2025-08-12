public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SistemaOperativo so = new SistemaOperativo();
        so.load();
        so.tamanoTotal();
        so.pintarArbol();
        
    }
}
