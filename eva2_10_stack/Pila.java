
package eva2_10_stack;

public class Pila extends Lista{
    // Necesitamos el metodo peel()
    public int peek() throws Exception{
        return getPosicion(tamanoLista() - 1);
    }
    
    // Necesitamos el metodo pop()
    public int pop() throws Exception{
        int temp = getPosicion(tamanoLista() - 1);
        borrarEn(tamanoLista() - 1);
        return temp;
    }
}
