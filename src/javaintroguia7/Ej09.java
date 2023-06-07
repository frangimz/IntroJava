/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 * @author frangimz
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();
        
        if(frase.substring(0, 0).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        leer.close();
    }
    
}
