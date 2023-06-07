/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
 * @author frangimz
 */
public class Ej24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int N;
        
        System.out.println("Ingresar de que temaño va a ser el vector");
        N=leer.nextInt();
        
        int[] vect= new int[N];
        
        llenarVectFibo(vect);
        
        System.out.println("El vector con los numero fibonacci queda:");
        mostrarVect(vect);
    }
    
    private static void llenarVectFibo(int[] vect){
        for (int i = 0; i < vect.length; i++) {
            if(i>=2){
                vect[i]=vect[i-2]+vect[i-1];
            }else{
                vect[i]=1;
            }
        }
    }
    
    private static void mostrarVect(int[] vect1){
        for (int i = 0; i < vect1.length; i++) {
            System.out.print("["+vect1[i]+"]");
        }
        System.out.println("");
    }
    
}
