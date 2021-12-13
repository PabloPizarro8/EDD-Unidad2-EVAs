/*
STACK:
Listas
Agregan al final de la lista
Leemos al final de la lista
peek() -- > Regresa el ultimo element de la lista
pop() -- > Regresa y elimina el ultimo elemento de la lista

 */
package eva2_10_stack;

public class EVA2_10_STACK {
    
    public static void main(String[] args) {
        Pila miPila = new Pila();
        
        miPila.add(0);
        miPila.add(100);
        miPila.add(200);
        miPila.add(300);
        miPila.add(400);
        
        miPila.printList();
        
        try {
            System.out.println("peek(): " + miPila.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        miPila.printList();
        
        try {
            System.out.println("pop(): " + miPila.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        miPila.printList();
    }
    
}
