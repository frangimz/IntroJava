/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaintroguia7;
import java.util.Scanner;

/**
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * @author frangimz
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese el nombre");
        nombre=leer.next();
        
        System.out.println("Su nombre es: "+nombre);
        
        leer.close();
    }
    
}
