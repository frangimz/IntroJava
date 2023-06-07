/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 * @author frangimz
 */
public class Ej13{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n;
        
        System.out.println("Ingresar n");
        n=leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1){
                    System.out.print("*");
                }else{
                    if(j==0 || j==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
