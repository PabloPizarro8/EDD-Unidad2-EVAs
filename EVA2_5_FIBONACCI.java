
package eva2_5_fibonacci;

public class EVA2_5_FIBONACCI {
    
    public static void main(String[] args) {
        /*
        // Lo tienes que hacer con recursividad, pero basate en esto.
        // De Pablo para Pablo
        
        int val1 = 0, val2 = 1;
        System.out.println(val1);
        for (int i = 0; i < 20; i++) {
            
            int temp = val2;
            val2 = val1 + val2;
            val1 = temp;
            System.out.println(val1);
        }
*/
        fibonacci(0, 1); // Iniciamos con valores iniciales 
    }
    
    public static void fibonacci(int iVal, int iVal2){
        int temp = iVal2; // Guardamos el valor de iVal2
        iVal2 = iVal + iVal2; // Sumamos los dos valores anteriores
        iVal = temp; // Damos el valor guardado en el primero valor
        System.out.println(iVal); // Imprimimos este valor
        if (iVal2<35) { // Comprobamos si iVal2 es menor a 35 para saber cuando cerrar el ciclo
            fibonacci(iVal, iVal2); // Volvemos a llamar al metodo
        }
    }
}
