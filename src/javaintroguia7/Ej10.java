/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
 *
 * @author frangimz
 */
public class Ej10{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int limPos,acum=0,num;
        
        System.out.println("Ingrese un numero limite positivo");
        limPos=leer.nextInt();
        
        while(acum<limPos){
            System.out.println("Ingrese un numero para acumular (acum="+acum+", lim:"+limPos+")");
            num=leer.nextInt();
            acum=acum+num;
        }
        
        System.out.println("El valor Final acumulado es: "+acum);
        
        leer.close();
    }
    
}