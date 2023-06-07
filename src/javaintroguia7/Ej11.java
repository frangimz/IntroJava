/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * @author frangimz
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int n1,n2,opc;
        String opc2;
        opc=0;
        
        
        System.out.println("Ingrese el numero 1");
        n1=leer.nextInt();
        System.out.println("Ingrese el numero 2");
        n2=leer.nextInt();
        
        while(opc!=5){
            System.out.println("Menu\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
            System.out.println("Elija opción");
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    System.out.print("La suma es: ");
                    System.out.println(n1+n2);
                    break;
                case 2:
                    System.out.print("La resta de n1-n2 es: ");
                    System.out.println(n1-n2);
                    break;
                case 3:
                    System.out.print("La multiplicación es: ");
                    System.out.println(n1*n2);
                    break;
                case 4:
                    System.out.print("La división de n1/n2 es: ");
                    System.out.println((float)n1/n2);
                    break;
                case 5:
                    do{
                        System.out.println("Esta seguro salir del programa?(S/N)");
                        leer.nextLine(); //limpiar buffer
                        opc2=leer.nextLine();
                    }while(!opc2.equals("S") && !opc2.equals("N"));
                    if(opc2.equals("N")){
                        opc=0;
                    }
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        leer.close();
    }
    
}
