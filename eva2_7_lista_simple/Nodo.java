
package eva2_7_lista_simple;

public class Nodo {
    private int iDato; // Aqui guardaremos el dato
    private Nodo siguiente; // Aqui guardaremos los siguientes nodos
    
    // Constructores
    public Nodo(){ // Si no pasamos ningun parametro
        this.siguiente = null;
    }
    public Nodo(int dato){ // si pasamos el dato
        this.iDato = dato;
        this.siguiente = null;
    }

    //  SETTERS Y GETTERS
    
    // getter de dato
    public int getiDato() {
        return iDato;
    }

    // Setter de dato
    public void setiDato(int iDato) {
        this.iDato = iDato;
    }

    // Getter del nodo
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Setter del nodo
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
