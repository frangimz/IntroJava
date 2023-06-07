/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 * @author frangimz
 */
public class Ej08 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cont,num,contPar=0,contImp=0;
        
        cont=0;
        do{
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if((num%2)==0){//pares
                contPar++;
            }else{
                contImp++;
            }
            cont++;
        }while((num%5)!=0);

        System.out.println("La cantidad de numeros pares ingresados es: "+contPar);
        System.out.println("La cantidad de numeros impares ingresados es: "+contImp);
        System.out.println("La cantidad de numeros ingresados es: "+cont);
        
    }
}
