
package eva2_13_tipos_datos_genericos;

public class EVA2_13_TIPOS_DATOS_GENERICOS {
    
    public static void main(String[] args) {
        Prueba<Integer> prueba = new Prueba();
        
        // Si colocamos un numero, java interpreta que es un Integer. Como Python
        /*
        Si quisieramos un string, pondriamos un string
        Lo mismo con double, float, etc.
        Prueba prueba = new Prueba();
        prueba.setValor(100);
        
        Para siempre tener un solo tipo de dato, lo que haremos es colocar los corchetes 
        puntiagudos:
        Prueba<String> prueba = new Prueba();
        // Con esto asi, es obligatorio tener un solo tipo de dato, en este caso, String
        prueba.setValor("Hola mundo");
        */
        
        prueba.setValor(100);
        
        System.out.println(prueba.getValor());
    }
    
}

// Lo que esta entre estos corchetes punteagudos es como un tipo de dato que cambia
// Se le llama tipo de dato primitivo
// T seria algo asi como una variable de tipos
class Prueba <T>{
    private T valor;

    public Prueba() {
    }

    public Prueba(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
}