/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_teo;
import java.util.Scanner;

/**
 *
 * @author frangimz
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese el valor del motor (valor entre 1 y 4)");
            tipoMotor= leer.nextInt();

            switch(tipoMotor){
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe un valor valido de bomba");
                    break;
            }
        }while(tipoMotor<1 || tipoMotor>4);
        
    }
    
}
