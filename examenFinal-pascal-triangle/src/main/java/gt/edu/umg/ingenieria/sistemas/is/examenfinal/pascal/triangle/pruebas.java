/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.is.examenfinal.pascal.triangle;

/**
 *
 * @author enmanuel
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PascalTriangle pruebas = new PascalTriangle();
        
        int entrada=0;
        
        System.out.println(pruebas.build(entrada));
        System.out.println("------");
        entrada=100;
        
        System.out.println(pruebas.build(entrada));
        System.out.println("------");
        entrada=500;
        
        System.out.println(pruebas.build(entrada));
        
        
        
        
    }
    
}
