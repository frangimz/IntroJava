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
public class Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        int nota;
        
        nota=-1;
        
        while(nota<0 || nota>10){
            System.out.println("Ingrese la nota entre 0 y 10");
            nota=leer.nextInt();
        }
        
        System.out.println("La nota: "+nota+" es correcta");
        
    }
    
}
