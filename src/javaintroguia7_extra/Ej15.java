/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 * @author frangimz
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Ingrese el num1");
        num1=leer.nextInt();
        System.out.println("Ingrese el num2");
        num2=leer.nextInt();
        
        menu(num1,num2);
    }
    
    public static void menu(int num1,int num2){
        int opc;
        Scanner leer= new Scanner(System.in);
        
        do{
            System.out.println("Opciones:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicación");
            System.out.println("4. división");
            System.out.println("5. Salir");
            opc=leer.nextInt();
                
            switch(opc){
                case 1:
                    System.out.println("Resultado suma= "+suma(num1,num2));
                    break;
                case 2:
                    System.out.println("Resultado resta= "+resta(num1,num2));
                    break;
                case 3:
                    System.out.println("Resultado multiplicación= "+mult(num1,num2));
                    break;
                case 4:
                    System.out.println("Resultado división= "+div(num1,num2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            
        
        }while(opc!=5);
    }
    
    private static int suma(int num1,int num2){
        return num1+num2;
    }
    
    private static int resta(int num1,int num2){
        return num1-num2;
    }
    
    private static int mult(int num1,int num2){
        return num1*num2;
    }
    
    private static double div(int num1,int num2){
        double out= ((double)num1/(double)num2);
        return out;
    }
    
}

