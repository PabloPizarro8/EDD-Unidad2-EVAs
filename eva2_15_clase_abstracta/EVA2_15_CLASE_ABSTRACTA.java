
package eva2_15_clase_abstracta;

public class EVA2_15_CLASE_ABSTRACTA{
    
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.algo();
    }
    
}

abstract class Prueba{
    public void d(){
        
    }
}

interface Algo{
    public void a();
    public int b();
    public boolean c();
}