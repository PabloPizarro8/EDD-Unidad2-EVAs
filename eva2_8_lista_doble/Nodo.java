
package eva2_8_lista_doble;

public class Nodo {
    private int iDato; // Aqui guardaremos el dato
    private Nodo siguiente; // Aqui guardaremos los siguientes nodos
    private Nodo previo;
    
    // Constructores
    public Nodo(){ // Si no pasamos ningun parametro
        this.siguiente = null;
        this.previo = null;
    }
    public Nodo(int dato){ // si pasamos el dato
        this.iDato = dato;
        this.siguiente = null;
        this.previo = null;
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

    // Getter del nodo siguiente
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Setter del nodo siguiente
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    // Getter del nodo previo
    public Nodo getPrevio() {
        return previo;
    }

    // Setter del nodo previo
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
}
