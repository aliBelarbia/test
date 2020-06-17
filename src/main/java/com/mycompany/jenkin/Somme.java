
package com.mycompany.jenkin;

/**
 *
 * @author A.Belarbia BDEB
 */
public class Somme {
    
    public static int add(String nbr1, String nbr2)
    {
        int valeurInt1 = Integer.parseInt(nbr1);
        int valeurInt2 = Integer.parseInt(nbr2);
        
        return valeurInt1 + valeurInt2;
    }
    
     public static int Multiply(String nbr1, String nbr2)
    {
        int valeurInt1 = Integer.parseInt(nbr1);
        int valeurInt2 = Integer.parseInt(nbr2);
        
        return valeurInt1 * valeurInt2;
    }
    
}
