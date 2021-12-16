
package eva2_18_collections_4;

import java.util.LinkedHashSet;
import java.util.Set;

public class EVA2_18_COLLECTIONS_4 {
    
    public static void main(String[] args) {
        /**
         * Conjuntos: matematicas discretas -> No tiene elementos repetidos
         * 
        */
        Set<Integer> conjunto = new LinkedHashSet<>();
        
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        conjunto.add(400);
        conjunto.add(500);
        conjunto.add(600);
        conjunto.add(600);
        
        System.out.println(conjunto);
    }
    
}
