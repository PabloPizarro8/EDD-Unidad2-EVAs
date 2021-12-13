
package eva2_11_arbol_binarie;

public class ArbolBinarie {
    private Nodo raiz;

    public ArbolBinarie() {
        this.raiz = null;// Arbol vacio -- es solo una semilla sin germinar
    }
    
    // A partir de aqui todo es recursion (Asi como yo en la carrera)
    // Dos metodos, uno publico y otro donde se hace el jale (frontend y backend)
        // Metodo publico
        // Agregar nodo:
    public void agregar(int valor){
        Nodo nuevo = new Nodo(valor);
        
        // Verificar si hay nodos en el arbole
            // Si hay
        if(raiz == null){
            raiz = nuevo;
        }
            // Otro
        else{
            // Aqui va el metodo recursivo
            /*Porque recursivo? 
            Es debid a que tiene que pasar por cada nodo, no es como las listas
            1 se parte en 2, asi cada uno
            Los menores se van a la izquierda
            revisa si hay nodos
            */
            agregarRecu(raiz, nuevo);
        }
    }
    
        // Metodo privado
        // Agregar ramas
    private void agregarRecu(Nodo actual, Nodo nuevo){
        // Verificar el lado al que va el nodo
            // Izquierdo
            // Si el dato nuevo es menor al actual:
        if (nuevo.getiDato() < actual.getiDato()){
                // Si el lado izquierdo esta vacio:
            if(actual.getIzquierda() == null){
                // Establecemos nuevo como el lado iquierdo de actual
                actual.setIzquierda(nuevo);
            }
                // En caso de que no:
            else{
                // Llamar de nuevo el metodo recursivo, moviendome a la izquierda
                    // Para movernos a la izquierda, sera el nodo izquierdo del actual
                agregarRecu(actual.getIzquierda(), nuevo);
            }
        }
            // Derecha
            // Si el dato nuevo es mayor que el dato actual:
        else if(nuevo.getiDato() > actual.getiDato()){
                // si el lado derecho esta libre:
            if(actual.getDerecha() == null){
                // Establecemos nuevo como el lado derecho de actual
                actual.setDerecha(nuevo);
            }
                // En caso de que no
            else{
                // LLamar el metodo recursivo de nuevo, moviendonos al lado derecho
                agregarRecu(actual.getDerecha(), nuevo);
            }
        }
            // valor igual al actual
        else{
            System.out.println("El valor ya existe en el arbol, no hare nada.");
        }
    }
    
    // Borrar nodo
    /*
    Si borramos un nodo, su hijo izquierdo, si existe, pasa a ser el nodo padre
    en codigo seria algo asi como el nodo hijo pasa a ser el hijo del abuelo
    */
    
    // IMPRIMIR NODOS DEL ARBOL
        // inOrder
    public void printInOrder(){
        inOrder(raiz);
        System.out.println("\n");
    }
    
    private void inOrder(Nodo actual) {
        if (actual != null) {
            inOrder(actual.getIzquierda());
            System.out.print("[" + actual.getiDato() + "]");
            inOrder(actual.getDerecha());
        }
    }
    
        // preOrder
    public void printPreOrder(){
        preOrder(raiz);
        System.out.println("\n");
    }
    
    private void preOrder(Nodo actual){
        // Saber en que direccion irse, o si esta vacio:
            // Si el metodo actual contiene algo, pos:
        if(actual != null){
            // Imprimimos el nodo
            System.out.print("[" + actual.getiDato() + "]");
                // Nos vamos al lado izquierdo
            preOrder(actual.getIzquierda());
                // Nos vamos al lado derecho
            preOrder(actual.getDerecha());
        }
        // No hay nada? Pos no hago nada, como la ves?
    }
    
        // postOrder
    public void printPostOrder(){
        postOrder(raiz);
        System.out.println("\n");
    }

    private void postOrder(Nodo actual) {
        if(actual != null){
            System.out.print("[" + actual.getiDato() + "]");
            
            postOrder(actual.getDerecha());
            
            postOrder(actual.getIzquierda());
        }
    }
    
    public void printOtherOrder(){
        otherOrder(raiz);
        System.out.println("\n");
    }

    private void otherOrder(Nodo actual) {
        if (actual != null) {
            otherOrder(actual.getDerecha());
            otherOrder(actual.getIzquierda());
            
            System.out.print("[" + actual.getiDato() +"]");
        }
    }
}
