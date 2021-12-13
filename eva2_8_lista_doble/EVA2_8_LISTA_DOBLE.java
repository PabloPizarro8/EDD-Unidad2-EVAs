
package eva2_8_lista_doble;

public class EVA2_8_LISTA_DOBLE {

    public static void main(String[] args) {
        ListaDoble miListaDoble = new ListaDoble();
        
        // Agregar nodos a la lista
        miListaDoble.agregar(0);
        miListaDoble.agregar(100);
        miListaDoble.agregar(200);
        miListaDoble.agregar(400);
        miListaDoble.agregar(500);
        
        // Imprimir la lista
        miListaDoble.printList();
        
        // Limpiar la lista
        // miListaDoble.limpiar();
        // miListaDoble.printList();
        
        // Ver tamaño de la lista
        System.out.println(miListaDoble.tamanoLista());
        
        // Ver un nodo especifico
        /*try {
            System.out.println("\nNodo en posicion 4: " + miListaDoble.getPosicion(04));
        } catch (Exception ex) {
            ex.printStackTrace(); // Imrpime el error
        }*/
        
        // Insertar un nodo en inicio
        // miListaDoble.insertarEn(0, 1);
        // miListaDoble.printList();
        
        // Insertar un nodo en cualquier parte
        // miListaDoble.insertarEn(3, 300);
        // miListaDoble.printList();
        
        // Borrar el primer nodo 
        // miListaDoble.borrarEn(0);
        // miListaDoble.printList();
        
        // Borrar un nodo cualquiera
        // miListaDoble.borrarEn(3);
        // miListaDoble.printList();
        
        // Imprimir la lista inversamente
        // awiwi, si me salio esta condenadez
        
        miListaDoble.printReversList();
        
    }
    
}
