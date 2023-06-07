/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author frangimz
 */
public class Ej16{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int[] vect=new int[100];
        int val;
        
        System.out.println("Ingrese valor a buscar");
        val=leer.nextInt();
        
        loadVectRandom(vect);
        System.out.println("vector cargado aleatoriamente");
        showVect(vect);
        searchVect(vect,val);
        
        
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
    
    public static void searchVect(int[] vect,int val){
        boolean exist=false;
        int cont=0,pos=0;
        
        for (int i = 0; i < vect.length; i++) {
            if(val==vect[i]){
                exist=true;
                if(cont==0){
                    pos=i;
                }
                cont++;
            }
        }
        
        if(exist){
            System.out.println("valor encontrado");
            System.out.println("se encuentra "+cont+" veces.");
            System.out.println("posicion del primer valor encontrado: "+pos);
        }else{
            System.out.println("Valor no encontrado");
        }
    }
    
}
