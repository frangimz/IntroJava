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
public class Ej09{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int val=-1,i=0,acum=0;
        
        while(i<20 && val!=0){
            System.out.println("Ingrese el valor "+i);
            val=leer.nextInt();
            if(val>0){
                acum+=val;
            }
            i++;
        }
        
        if(val==0){
            System.out.println("Se ingreso un valor 0");
        }
        
        System.out.println("La acumulación de los numeros ingresados es:");
        System.out.println(acum);
        
    }
    
}
