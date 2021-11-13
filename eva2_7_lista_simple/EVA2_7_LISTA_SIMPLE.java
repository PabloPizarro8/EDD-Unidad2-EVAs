
package eva2_7_lista_simple;

public class EVA2_7_LISTA_SIMPLE {
    
    public static void main(String[] args) {
        // crear una lista
        Lista miLista = new Lista(); // Creo una lista vacia
        /*
        int[] aiArreglo = new int[1000000];
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo((int) (Math.random() * 1000)));
        }
        miLista.printList();
        */
        
        Nodo nodoNuevo = new Nodo(100);
        miLista.add(nodoNuevo);
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.add(new Nodo(500));
        
        miLista.printList();
        miLista.clearList();
        
        System.out.println("\nDespues de limpiar");
        miLista.add(new Nodo(600));
        miLista.add(new Nodo(700));
        miLista.add(new Nodo(800));
        miLista.add(new Nodo(900));
        miLista.add(new Nodo(1000));
        miLista.add(new Nodo(1100));
        miLista.printList();
        
        //System.out.println("\nConteo de nodos");
        System.out.println("\nPosicion de nodo");
        System.out.println(miLista.getPosicion(04));
    }
    
}
