/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 * @author frangimz
 */
public class Ej04 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        String numR="";
        
        do{
            System.out.println("Ingrese un numero entre 1 y 10");
            num=leer.nextInt();
        }while(num<1 || num>10);
        
        switch(num){
            case 1:
                numR="I";
                break;
            case 2:
                numR="II";
                break;
            case 3:
                numR="III";
                break;
            case 4:
                numR="IV";
                break;
            case 5:
                numR="V";   
                break;
            case 6:
                numR="VI";
                break;
            case 7:
                numR="VII";
                break;
            case 8:
                numR="VIII";
                break;
            case 9:
                numR="IX";
                break;
            case 10:
                numR="X";   
                break;     
        }
        System.out.println("El numero: "+num+" en romano es: "+numR);
    }
}
