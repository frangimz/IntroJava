/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author frangimz
 */
public class Ej15{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int[] vect=new int[100];
        
        loadVectRandom(vect);
        System.out.println("vector cargado aleatoriamente");
        showVect(vect);
        orderVectDesc(vect);
        System.out.println("vector ordenado");
        showVect(vect);
        
        leer.close();
    }
    
    public static void loadVectRandom(int[] vect){
        for (int i = 0; i < vect.length; i++) {
            vect[i]= (int) (Math.random()*100);
        }
    }
    
    public static void showVect(int[] vect){
        for (int i = 0; i < vect.length; i++) {
            System.out.print("["+vect[i]+"]");
            if(((i+1)%10)==0){
                System.out.println("");
            }
        }
    }
    
    public static void orderVectDesc(int[] vect){
        int aux;
        for (int i = 0; i < vect.length-1; i++) {
            for (int j = 0; j < vect.length-i-1; j++) {
                if(vect[j]<vect[j+1]){
                    aux=vect[j];
                    vect[j]=vect[j+1];
                    vect[j+1]=aux;
                }
            }
        }
    }
    
    
}
