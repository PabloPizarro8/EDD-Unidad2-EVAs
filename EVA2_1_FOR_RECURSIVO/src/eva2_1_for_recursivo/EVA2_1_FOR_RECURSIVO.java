
package eva2_1_for_recursivo;

public class EVA2_1_FOR_RECURSIVO {
    
    
    public static void main(String[] args) {
        
        recursivo();
    }
    // El metodo se llama a si mismo
    public static void recursivo(){
        System.out.println("Hola mundo");
        recursivo();
    }
    
}
