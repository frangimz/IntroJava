/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author frangimz
 */
public class Ej05{

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        char letra;
        double importe;
        
        do{
            System.out.println("Ingrese una el tipo de socio (A/B/C)");
            letra=leer.next().charAt(0);
        }while(letra!='A' && letra!='B' && letra!='C');
        
        do{
            System.out.println("Ingrese el costo");
            importe=leer.nextDouble();
        }while(importe<0);
        
        System.out.println("La letra ingresada fue: "+letra);
        
        if(letra=='A'){
            importe=importe*(1-0.5); //A descuento del 50%
        }
        
        if(letra=='B'){
            importe=importe*(1-0.35); //B descuento del 35%
        }
        
        //C no tiene descuento
        
        System.out.println("Importe a pagar: "+importe);
        
    }
}
