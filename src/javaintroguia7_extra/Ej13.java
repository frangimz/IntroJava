/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 * @author frangimz
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num;
        
        do{
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        }while(num<0);
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}
