/*
ARBOL BINARIO
empeamos de un nodo
cada nodo estara enlazado a otros dos nodos como maximo

 */
package eva2_11_arbol_binarie;

public class EVA2_11_ARBOL_BINARIE {
    
    public static void main(String[] args) {
        ArbolBinarie arbol = new ArbolBinarie();
        
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        
        System.out.println("PreOrder: ");
        arbol.printPreOrder();
        
        System.out.println("PostOrder: ");
        arbol.printPostOrder();
        
        System.out.println("InOrder: ");
        arbol.printInOrder();
        
        System.out.println("OtherOrder: ");
        arbol.printOtherOrder();
        
    }
    
}
