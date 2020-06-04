/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.scanner;
import java.util.Scanner;
/**
 *
 * @author Notebook
 */
public class NumeroScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        num = lector.nextInt();
        
        System.out.println("El numero ingresado es:" + num);
    }
    
}
