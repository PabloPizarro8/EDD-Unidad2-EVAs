/*
Queue:
    Lista.
    Agregamos al final de la lista (add)
    Leemos al inicio de la lista:
        peek() - Regresa el primer valor de la lista
        poll() - Regresa y remueve el primer valor de la lista
*/
package eva2_9_queue;

public class EVA2_9_QUEUE {
    
    public static void main(String[] args) {
        Cola miCola = new Cola();
        
        miCola.add(0);
        miCola.add(100);
        miCola.add(200);
        miCola.add(300);
        miCola.add(400);
        miCola.add(500);
        
        miCola.printList();
        
        try {
            System.out.println("Peek: " + miCola.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            System.out.println("Poll: " + miCola.poll());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        miCola.printList();
        
        try {
            System.out.println("Peek: " + miCola.peek());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
