
package eva2_9_queue;

public class Lista {
    private Nodo inicio, finnal;
    private int tamano; // Contador de nodos

    public Lista() {
        inicio = null; // LISTA VACIA
        finnal = null; // Posicion final de la lista
        tamano = 0;
    }
    
    // AGREGAR NODOS
    public void add(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        // ¿HAY NODOS EN LA LISTA?
        if (inicio == null) {  // LISTA VACIA
            inicio = nuevoNodo;  // conectamos el primer nodo a la lista
            finnal = nuevoNodo;  // Conectamos el nuevo nodo al finale de la lista
        }else{  // Lista con nodos
            // Agregar el nodo al final de la lista
            finnal.setSiguiente(nuevoNodo);
            finnal = nuevoNodo;
            
        }
        tamano++;
    }
    
    // IMPRIMIR LA LISTA
    public void printList(){
        Nodo temp = inicio; // Empezamos desde el nodo inicial
        
        // Pasaremos por cada elemento de la lista hasta que encontremos un null 
        while(temp != null){
            System.out.print(temp.getiDato() + " - ");
            temp = temp.getSiguiente(); // Mover a temp al siguiente nodo
        }
        System.out.println("");
    }
    
    // LIMPIAR LA LISTA
    public void limpiar(){
        inicio = null; // Mandamos inicio a valor null, ocasionando que se borren todos 
            // los demas nodos
        finnal = null; // Por si
        tamano = 0;
    }
    
    // CONTAR LOS NODOS
    // Es ineficiente, cambiara en el futuro
    // Ya cambio, ahora parece mas un Getter XD
    public int tamanoLista(){
        return tamano;
    }
    
    // La lista esta vacia: true, con nodos: false
    public boolean isEmpty(){
        if(inicio == null) 
            return true;
        else
            return false;
    }
    
    // RECUPERAR UN VALOR DE LA LISTA:
    public int getPosicion(int iPos) throws Exception{
        // Verificacion 
        // Lista este vacia
        if(isEmpty()){
            throw new Exception("No hay valores almacenados en la lista!!");
        }
        else{// Posicion que no exista: negativa o excesiva
            // Pos tiene que estar entre cero y n-1
            // Si iPos es menor a cero, o mayor igual a N, entonces: 
            if( (iPos < 0) || (iPos >= tamanoLista() ) ){
                throw new Exception("Posicion fuera de rango");
            }
        }
        Nodo temp = inicio; // Empezamos en el nodo inicial
        // El ciclo for es para pasar por cada nodo hasta la posicion indicada
        for (int i = 0; i < (iPos); i++) {
            temp = temp.getSiguiente();  // Guardaremos cada nodo en temp, hasta llegar al deseado
        }
        return temp.getiDato();
    }
    
    // Agregar un nodo en x posicion de la lista, y que esta se extienda
    public void insertarEn(int iPos, int valor){
        Nodo nuevo = new Nodo(valor);
        // En caso de querer insertarlo al inicio
        if(iPos == 0){
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // En caso de que sea en cualquier otra posicion
        else{
            Nodo temp = inicio;
            // Movemos temp a una posicion anterior a la deseada
            for (int i = 0; i < (iPos - 1); i++) {
                temp = temp.getSiguiente();  // Guardaremos cada nodo en temp, hasta 
                                            // llegar al nodo previo al deseado
            }
            // Colocamos los nodos siguientes a la posicion en nuevo.setSiguiente()
            nuevo.setSiguiente(temp.getSiguiente());
            // y ponemos nuevo en el siguiente de temp
            temp.setSiguiente(nuevo);
        }
        tamano++;
    }
    
    // Borrar en cualquier posicion
    public void borrarEn(int iPos){
        if(tamanoLista() == 1){
            limpiar();
        }
        else{
            // en caso de que sea la posicion 0
            if(iPos == 0){
                inicio = inicio.getSiguiente();
            }
            // en caso de que sea cualquier otra posicion diferente de 0
            else{
                Nodo temp = inicio;
                for (int i = 0; i < (iPos - 1); i++) {
                    temp = temp.getSiguiente();  // Guardaremos cada nodo en temp, hasta llegar al deseado
                }
                // Algo confuso aqui, Pablo del futuro
                /*
                Pasaremos de temp el siguiente del siguiente a setSiguiente de temp
                para que el primer getSiquiente se borre
                este siguiente es la posicion que queremos borrar
                
                ejemplo, si queremos eliminar el 2 (para la lista es el 3) 
                entonces temp se quedara en 1, buscaremos el siguiente del siguiente de este
                que seria el siguiente de 2, o sea el 3, y este lo mandaremos al siguiente de
                1, que es 2, eliminando este ultimo
                
                quedandonos solo los puestos 0 1 3 4
                
                atte Pablo del pasado
                */
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                
                if(iPos == tamanoLista() - 1){ // Verificar si es el ultimo nodo de la lista
                    finnal = temp;
                }
            }
        }
        tamano--;
    }
}
