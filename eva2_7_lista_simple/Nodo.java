
package eva2_7_lista_simple;

public class Nodo {
    private int iDato;
    private Nodo siguiente;
    
    public Nodo(){
        this.siguiente = null;
    }
    public Nodo(int dato){
        this.iDato = dato;
        this.siguiente = null;
    }

    public int getiDato() {
        return iDato;
    }

    public void setiDato(int iDato) {
        this.iDato = iDato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
