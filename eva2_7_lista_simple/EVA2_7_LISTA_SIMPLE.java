
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
        
        miLista.add(00);
        miLista.add(100);
        miLista.add(200);
        // miLista.add(300);
        miLista.add(400);
        miLista.add(500);
        
        miLista.printList(); // Imprimir la lista
        
        /*// Limpiar la lista y probar si se limpio
        miLista.clearList();
        
        System.out.println("\nDespues de limpiar");
        
        miLista.add(new Nodo(600));
        miLista.add(new Nodo(700));
        miLista.add(new Nodo(800));
        miLista.add(new Nodo(900));
        miLista.add(new Nodo(1000));
        miLista.add(new Nodo(1100));
        
        miLista.printList();*/  // Esta quitada del programa debido a que ya vimos que servia limpiar
        
        System.out.println("\nCantidad de nodos: " + miLista.tamanoLista());
        
        // Intentar, sino, atrapar el exception
        /*try {
            System.out.println("\nNodo en posicion 4: " + miLista.getPosicion(04));
        } catch (Exception ex) {
            ex.printStackTrace(); // Imrpime el error
        }*/
        
        // Agregar un nodo en inicio 
        /*System.out.println("Lista insertando un valor al inicio");
        miLista.insertarEn(0, 0);
        miLista.printList();
        
        System.out.println("Tamaño de la lista: " + miLista.tamanoLista());*/
        
        // Agregar un nodo en cualquier posicion
        /*System.out.println("Lista insertando un valor en cualquier posicion");
        miLista.insertarEn(2, 50);
        miLista.printList();
        
        System.out.println("Tamaño de la lista: " + miLista.tamanoLista());*/
        
        // Borrar un nodo al inicio
        /*System.out.println("Lista borrando un nodo al inicio");
        miLista.borrarEn(0);
        miLista.printList();
        
        System.out.println("Tamaño de la lista: " + miLista.tamanoLista());*/
        
        // Borrar un nodo cualquiera
        /*System.out.println("Lista borrando un nodo cualquiera");
        miLista.borrarEn(5);
        miLista.printList();
        
        System.out.println("Tamaño de la lista: " + miLista.tamanoLista());*/
        
        // Imprimir la lista inversamente
        /*for (int i = (miLista.tamanoLista() - 1); i >= 0; i--) {
            try {
                System.out.println(miLista.getPosicion(i) + " - ");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
        
        miLista.insertarEn(3, 300);
        
        miLista.printList();
    }
    
}
