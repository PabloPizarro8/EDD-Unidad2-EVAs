
package eva2_16_collections_3;

import java.util.ArrayList;

public class EVA2_16_COLLECTIONS_3 {
    
    public static void main(String[] args) {
        /*
        Similar al LinkedList, pero trabaja con arreglos
        Mejor para almacenar datos
        Malo para 
        */
        ArrayList arrayList = new ArrayList();
        
        arrayList.add(1000);
        arrayList.add(2000);
        arrayList.add(3000);
        arrayList.add(4000);
        arrayList.add(5000);
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        System.out.println("Ver solo el elemento 4: " + arrayList.get(4) + "\n");
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        arrayList.remove(4);
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        arrayList.clear();
        
        System.out.println("Ver el arrayList: \n\t" + arrayList + "\n");
        
        
    }
    
}
