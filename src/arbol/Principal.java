package arbol;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        


        
        System.out.println("");
        miArbol.getInOrden(miArbol.retornaraiz());
        System.out.println("");
        
        System.out.println("Hojas:");
        miArbol.getHojas(miArbol.retornaraiz());
        System.out.println("");
        
         System.out.println("Padres:");
        miArbol.getPadres(miArbol.retornaraiz());
        System.out.println("");
        
         
        miArbol.getNivel(miArbol.retornaraiz(),0);
        System.out.println("");
        
        /* System.out.println("");
        miArbol.getPreOrden(miArbol.retornaraiz());
        System.out.println("");
        
         System.out.println("");
        miArbol.getPostOrden(miArbol.retornaraiz());
        System.out.println("");*/
        
        
       
        
        
        
    }
}
