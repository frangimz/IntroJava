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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] vect= new String[5];

        loadVect(vect);
        showVect(vect);
        
    }
    
    public static void loadVect(String[] vect){
        int i;
        Scanner leer= new Scanner(System.in);
        
        for(i=0;i<vect.length;i++){
            int participante=i+1;
            System.out.println("Ingrese el nombre del participante "+participante+"/"+vect.length);
            vect[i]=leer.next();
        }
    }
    
    public static void showVect(String[] vect){
        int i;
        
        System.out.println("Los valores del vector son:");
        for(i=0;i<vect.length;i++){
            System.out.print("["+vect[i]+"]");
        }
        System.out.println("");
    }
}
