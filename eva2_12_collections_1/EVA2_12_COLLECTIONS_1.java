
package eva2_12_collections_1;

import java.util.LinkedList;

public class EVA2_12_COLLECTIONS_1 {
    
    public static void main(String[] args) {
        // listas enlazada -- > LinkedList
        LinkedList<Integer> linkedList = new LinkedList();
        /*
        tipos de datos genericos
        */
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        
        /*
        Espera, no deberia imprimir la direccion de memoria?
        Resulta y acontece, que esto tiene implementado un metodo el cual permite
        imprimir el contenido, pasandose la direccion de memoria por su codigo fuente
        */
        System.out.println(linkedList);
        
        System.out.println(linkedList.get(3));
        
        linkedList.remove(3);
        
        System.out.println(linkedList);
        
        linkedList.clear();
        
        System.out.println(linkedList);
        
    }
    
}
