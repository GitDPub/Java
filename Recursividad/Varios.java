package Recursividad;

/**
 * Created by root on 12-12-17.
 */
public class Varios
{
    public static void main(String[] args)
    {
        int n=123;
        System.out.println(n+" invertido: "+invertir(n));
        System.out.println("suma de digitos de "+ n +" es: "+sumarDig(n));
    }

    static int invertir (int n)
    {
        if (n < 10)
            return n;
        else
            return (n % 10) + invertir (n / 10) * 10;
    }

    static int sumarDig (int n)
    {
        if (n == 0)      //caso base
            return n;
        else
            return sumarDig (n / 10) + (n % 10);
    }
    
    
    
}
