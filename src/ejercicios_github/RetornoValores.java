/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_github;

/**
 *
 * @author alber
 */
public class RetornoValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = sumar(5,10);
        
        System.out.println(resultado);
    }
    
    public static int sumar(int inicio, int fin){
        if(fin>inicio){
            return fin+sumar(inicio, fin-1);
            
        }else{
            return fin;
        }
        
    }
}
