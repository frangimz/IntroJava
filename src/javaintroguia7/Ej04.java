/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author frangimz
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float c,f;
        
        System.out.println("Ingrese una temperatura en grados centigrados");
        c=leer.nextFloat();
        
        f=32+(9*c/5);
        
        System.out.println("La temperatura "+c+"ºC es equivalente a "+f+"ºF");
        
        leer.close();
    }
    
}
