/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 * @author frangimz
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        
        System.out.println("La cantidad de digitos es: "+cantDig(num));
        
    }
    
    private static int cantDig(int num){
        int out=0;
        
        while(num>9){
            out++;
            num=num/10;
        }
        out++;
        return out;
    }
    
}
