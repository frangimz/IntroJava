/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_teo;
import java.util.Scanner;

/**
 *
 * @author frangimz
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int val1,val2;
        
        System.out.println("Se va evaluar si el primer numero es multiplo del segundo");
        System.out.println("Ingrese un numero");
        val1=leer.nextInt();
        System.out.println("Ingrese otro numero");
        val2=leer.nextInt();
        
        esMultiplo(val1,val2);
    }
    
    public static void esMultiplo(int num1, int num2){
    if((num1%num2)==0){
        System.out.println(num1+" es multiplo de "+num2);
    }else{
        System.out.println(num1+" no es multiplo de "+num2);
    }
    }
}
