/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * @author frangimz
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int valRandom,num;
        
        valRandom=genMult();
        
        do{
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            if(num!=valRandom){
                System.out.println("Incorrecto");
            }else{
                System.out.println("Correcto");
            }
        }while(num!=valRandom);
    }
    
    private static int genMult(){
        int num1,num2;
        
        do{
            num1=(int)(Math.random()*10);
            num2=(int)(Math.random()*10);
        }while(num1*num2>10);
        
        return num1*num2;
    }
    
}
