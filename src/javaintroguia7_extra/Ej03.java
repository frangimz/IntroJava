/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 * @author frangimz
 */
public class Ej03{

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String letra,pLetra;
        
        System.out.println("Ingrese una letra");
        letra=leer.next();
        
        pLetra=letra.substring(0, 1);
        
        if(pLetra.equals("a") || pLetra.equals("e") || pLetra.equals("i") || pLetra.equals("o")|| pLetra.equals("u") ){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
}
