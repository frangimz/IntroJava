/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 * @author frangimz
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int val1,val2,suma;
        
        System.out.println("Ingrese el primer numero");
        val1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        val2=leer.nextInt();
        
        suma=val1+val2;
        
        System.out.println("La suma de los dos numeros es: "+suma);
    
        leer.close();
    }
    
}
