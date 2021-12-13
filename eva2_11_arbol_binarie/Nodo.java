
package eva2_11_arbol_binarie;

public class Nodo {
    private int iDato; // Aqui guardaremos el dato
    private Nodo derecha; // Aqui guardaremos los siguientes nodos
    private Nodo izquierda;
    
    // Constructores
    public Nodo(){ // Si no pasamos ningun parametro
        this.derecha = null;
        this.izquierda = null;
    }
    public Nodo(int dato){ // si pasamos el dato
        this.iDato = dato;
        this.derecha = null;
        this.izquierda = null;
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
    public Nodo getDerecha() {
        return derecha;
    }

    // Setter del nodo siguiente
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    // Getter del nodo previo
    public Nodo getIzquierda() {
        return izquierda;
    }

    // Setter del nodo previo
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
}
