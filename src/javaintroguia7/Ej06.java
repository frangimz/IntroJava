/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Crear un programa que dado un numero determine si es par o impar.
 * @author frangimz
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        if((num%2)==0){
            System.out.println("El numero "+num+" es par");
        }else{
            System.out.println("El numero "+num+" es impar");

        }
            
        leer.close();
    }
    
}
