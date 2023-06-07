/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 * @author frangimz
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int N,suma;
        
        System.out.println("Ingrese cuantos elementos va a ingresar");
        N= leer.nextInt();
        
        int[] vect=new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingresar el elemento "+i+"/"+N);
            vect[i]=leer.nextInt();
        }
        
        suma=0;
        for (int i = 0; i < N; i++) {
            suma+=vect[i];
        }
        
        System.out.println("La suma de todos los elementos del vector son: "+suma);   
        
    }
    
}
