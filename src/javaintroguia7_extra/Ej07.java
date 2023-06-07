/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 * @author frangimz
 */
public class Ej07 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,max,min,acumPos,nPos;
        
        
        System.out.println("Cuantos valores desea ingresar");
        n= leer.nextInt();
        
        int[] vect=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor "+i);
            vect[i]=leer.nextInt();
        }
        
        max=vect[0];
        min=vect[0];
        acumPos=0;
        nPos=0;
        for (int i = 0; i < n; i++) {
            if(vect[i]>max){
                max=vect[i];
            }
            if(vect[i]<min){
                min=vect[i];
            }
            if(vect[i]>0){
                acumPos+=vect[i];
                nPos++;
            }
        }
        System.out.println("El valor maximos ingresado es: "+max);
        System.out.println("El valor minimo ingresado es: "+min);
        if(nPos>0){
            System.out.print("El promedio de valores positivos es: ");
            System.out.println(acumPos/nPos);
        }
        
    }
}
