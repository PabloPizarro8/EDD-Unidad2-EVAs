
package eva2_7_lista_simple;

public class Lista {
    private Nodo inicio, finnal;

    public Lista() {
        inicio = null; // LISTA VACIA
        finnal = null; // Posicion final de la lista
    }
    // AGREGAR NODOS
    public void add(Nodo nuevoNodo){
        // HAY NODOS EN LA LISTA?
        if (inicio == null) { // LISTA VACIA
            inicio = nuevoNodo; // conectamos el primer nodo a la lista
            finnal = nuevoNodo;
        }else{// Lista con nodos
            /*
            // Hay que movernos al final de la lista 
            // Usando temp, Nodo por nodo hasta llegar al final
            Nodo temp = inicio; // Aqui empiezo
            // While
            while(temp.getSiguiente() != null){ // Mientras temp sea diferente a null, nos vamos a mover
                temp = temp.getSiguiente(); // Mover a temp al siguiente nodo
            }
            temp.setSiguiente(nuevoNodo); // Conectamos al final de la lista al nuevo nodo
*/
            // Agregar el nodo al final de la lista
            finnal.setSiguiente(nuevoNodo);
            finnal = nuevoNodo;
            
        }
    }
    // IMPRIMIR LA LISTA
    public void printList(){
        Nodo temp = inicio; // Aqui empezamos
        
        while(temp != null){
            System.out.print(temp.getiDato() + " - ");
            temp = temp.getSiguiente(); // Mover a temp al siguiente nodo
        }
    }
    // LIMPIAR LA LISTA
    public void clearList(){
        inicio = null;
    }
    // CONTAR LOS NODOS
    public int lenght(){
        int iCont = 0;
        Nodo temp = inicio; // Aqui empezamos
        
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente(); // Mover a temp al siguiente nodo
        }
        return iCont;
    }
    
    // RECUPERAR UN VALOR DE LA LISTA:
    public int getPosicion(int iPos){
        Nodo temp = inicio;
        for (int i = 0; i < (iPos); i++) {
            temp = temp.getSiguiente();
        }
        return temp.getiDato();
    }
}
