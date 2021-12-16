
package eva2_17_collections_iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class EVA2_17_COLLECTIONS_ITERATOR {
    
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()) {            
            int iVal = (int) iterator.next();
            
            System.out.print("[" + iVal + "]");
        }
        System.out.println();
        
    }
    
}
