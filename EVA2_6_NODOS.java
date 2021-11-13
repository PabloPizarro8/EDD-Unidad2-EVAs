
package eva2_6_nodos;

public class EVA2_6_NODOS {
    
    public static void main(String[] args) {
        Nodo inicio = new Nodo();
        inicio.iDatos = 100; 
        inicio.referenciaNodo = new Nodo();
        inicio.referenciaNodo.iDatos = 200;
        inicio.referenciaNodo.referenciaNodo = null;
        
        // Imprimir la direccion de memoria
        System.out.println(inicio);
        System.out.println(inicio.referenciaNodo);
        System.out.println(inicio.referenciaNodo.referenciaNodo);
        
        // Imprimir datos
        System.out.println(inicio.iDatos);
        System.out.println(inicio.referenciaNodo.iDatos);
    }
    
}

class Nodo{
    int iDatos; // Datos -- Aqui agrupamos la informacion
    Nodo referenciaNodo; // Referencia -- Nos permite enlazar nodos, y crear cadenas (listas)
}