/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
 *
 * @author frangimz
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        System.out.print("El doble del numero es: ");
        System.out.println(2*num);
        
        System.out.print("El triple del numero es: ");
        System.out.println(3*num);
        
        System.out.println("La raiz cuadrada del numero es: ");
        System.out.println(Math.sqrt(num));
        
        leer.close();
    }
    
}
