
package arbol;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class NodoArbol {        // Función Principal
    Persona persona;
    NodoArbol li;
    NodoArbol ld;
    int dato;                 // se declara dato como entero (información del nodo)

    public NodoArbol(Persona nuevaPersona) {    //constructor del  NodoArbol. Función de cración del árbol
        this.persona = nuevaPersona;              //dato es igual a d
        li = null;
        ld = null;          //li, ld son null
    }
    public void busquedaProvincia(ArrayList<String> lista, int provincia){
        System.out.println(Integer.valueOf(this.persona.getCedula().charAt(0)));
        if(Integer.valueOf(String.valueOf(this.persona.getCedula().charAt(0))) == provincia){
            System.out.println("Entro");
            lista.add(this.persona.getNombre());
        }
        if(li != null){
            li.busquedaProvincia(lista, provincia);
        }
        if(ld != null){
            ld.busquedaProvincia(lista, provincia);
        }
    }

    /*
     *synchronized
     *apila procesos que luego se llevaran a cabo
     */

    /*________________________________________________*/// Función de insertar en el Árbol
    public synchronized void insertar(Persona nuevaPersona) {

        int  comparacion = this.persona.getCedula().compareTo(nuevaPersona.getCedula());
        if(comparacion == 0){
            return;
        }
        if (comparacion < 0) {                   // si d es menor que dato si insertará a la izquierda
            if (li == null) {             // en caso de que el nodo esté vacio
                li = new NodoArbol(nuevaPersona);  // se crea uno nuevo
                System.out.println("\nInsertado a la izquierda..."); // se inserta
            } else {
                li.insertar(nuevaPersona); // en caso de que ya hubiera uno insertado a la izquierda pero el nuevo es menor se corre al siguiente nodo
            }
        }

        if (comparacion > 0) {                       // si d es mayorr que dato si insertará a la derecha
            if (ld == null) {                 // en caso de que el nodo esté vasio
                ld = new NodoArbol(nuevaPersona);      // se crea uno nuevo
                System.out.println("\nInsertado a la derecha...");    // se inserta
            } else {
                ld.insertar(nuevaPersona); // en caso de que ya hubiera uno insertado a la derecha pero el nuevo es mayor se corre al siguiente nodo
            }
        }

    }//fin insertar

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int retornadato() {  // Función que vuelva a insertar otro dato
        return (dato);          // retorna a dato
    }                          //end retornadato
}