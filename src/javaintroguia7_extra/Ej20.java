/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;

/**
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 * @author frangimz
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=10;
        int[] vect1=new int[N];

        
        cargarVectRandom(vect1);
        
        System.out.println("El vector 1 es:");
        mostrarVect(vect1);
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
    
    
}
