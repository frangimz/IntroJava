/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;
/**
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 * @author frangimz
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese la cantidad de elementos de los vectores");
        N=leer.nextInt();
        
        int[] vect1=new int[N];
        int[] vect2=new int[N];
        
        cargarVectRandom(vect1);
        cargarVectRandom(vect2);
        
        System.out.println("El vector 1 es:");
        mostrarVect(vect1);
        
        System.out.println("El vector 2 es:");
        mostrarVect(vect2);
        
        System.out.println("Comparamos los vectores");
        if(compare(vect1,vect2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }
        
    }
    
    private static void cargarVectRandom(int[] vect1){
        for (int i = 0; i < vect1.length; i++) {
            vect1[i]=(int)(Math.random()*10);
        }
    }
    
    private static void mostrarVect(int[] vect1){
        for (int i = 0; i < vect1.length; i++) {
            System.out.print("["+vect1[i]+"]");
        }
        System.out.println("");
    }
    
    private static boolean compare(int[] vect1,int[] vect2){
        boolean out=true;
        
        for (int i = 0; i < vect1.length; i++) {
            if(vect1[i]!=vect2[i]){
                out=false;
            }
        }
        
        return out;
    }
    
}
