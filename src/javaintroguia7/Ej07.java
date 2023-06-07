/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 * @author frangimz
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        leer.close();
    }
    
}
