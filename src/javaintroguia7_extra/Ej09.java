/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 * @author frangimz
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int dividendo,divisor,cociente=0,resto;
        
        System.out.println("Vamos a hacer una division por restas sucesivas");
        do{
        System.out.println("Ingrese el dividendo");
        dividendo= leer.nextInt();
        }while(dividendo<0);
        do{
            System.out.println("Ingrese el divisor");
            divisor=leer.nextInt();
        }while(divisor<1);
        
        while(dividendo>=divisor){
            cociente++;
            dividendo-=divisor;
        }
        resto=dividendo;
        
        System.out.println("El cociente es: "+cociente);
        System.out.println("El resto es: "+resto);
    }
    
}
