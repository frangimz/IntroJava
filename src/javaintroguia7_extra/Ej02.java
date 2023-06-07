/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author frangimz
 */
public class Ej02{

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       int A,B,C,D,aux;
       
       System.out.println("Ingrese la variable A");
       A=leer.nextInt();
       
       do{
        System.out.println("Ingrese la variable B");
        B=leer.nextInt();
       }while(B==A);
       
       do{
        System.out.println("Ingrese la variable C");
        C=leer.nextInt();
       }while(C==A || C==B);
       
       do{
        System.out.println("Ingrese la variable D");
        D=leer.nextInt();
       }while(D==A || D==B || D==C);
       
       
       System.out.println("Valores ingresados: A: "+A+",B: "+B+",C: "+C+",D: "+D);
       //cambio de variable
       
       aux=B;
       B=C;
       C=A;
       A=D;
       D=aux;
       
       System.out.println("Despues del cambio de variables: A: "+A+",B: "+B+",C: "+C+",D: "+D);

    }
    
}
