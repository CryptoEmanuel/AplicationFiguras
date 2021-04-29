package app;

public class EntrarSistema {
    
    //private static EntrarSistema entrarSistema = newEntrarSistema();
    /**
    */
    private static Sistema sistema = null;
    
    public EntrarSistema() {
        super();
    }
    public static void  main( String[]args){
        sistema = new Sistema();
        
        sistema.miMain();
    
    }
}
