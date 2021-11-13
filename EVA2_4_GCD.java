
package eva2_4_gcd;

public class EVA2_4_GCD {
    
    public static void main(String[] args) {
        int iNum1 = 48, iNum2 = 180;
        System.out.println("El MCD de " + iNum1 + " y " + iNum2 + " es: " + gcd(iNum1, iNum2));
    }
    public static int gcd(int iDividendo, int iDivisor){
        // Como calculamos el residuo?
        // Modulo -- > %
        if(iDivisor == 0){
            return iDividendo;
        }
        else{
            int iResiduo = iDividendo % iDivisor;
            return gcd(iDivisor, iResiduo);
        }
        
    }
}
