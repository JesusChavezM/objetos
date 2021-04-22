/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_github;

/**
 trabajar los operadores 
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=20, b=10, c=0, d=20, e=40, f=30;
        boolean condition=true;
        
        //operador pre-incremento
        // a=a+1 y entonces c=a
        c=++a;
        
        System.out.println("Valor de c(++a)= "+c);
        
        //operador de post incremento (b toma el valor de c)
        //c=b entonces b=b+1
        
        
        System.out.println("Valor de c (b++)"+c);
        
        //operador de predecremento
        //d=d-1 entonces c=d
        c=-d;
        System.out.println("Valor de c (-d): "+c);
        
        //opewrador de post decremento
        //c=e entonces e=e-1 (e toma el valor de 39)
        c=-e;
        System.out.println("Valor de c (-e): "+c);
        
        //operador logico not
        System.out.println("Valor de Icondition= "+ !condition);
        
    }
    
}
