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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int val;
        
        for (int i = 0; i < 4; i++) {
            val=leer.nextInt();
            if(val>0 && val<=20){
                for (int j = 0; j < val; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
        leer.close();
    }
    
}
