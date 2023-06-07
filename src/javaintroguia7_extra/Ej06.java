/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 * @author frangimz
 */
public class Ej06 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int N,cantMen=0;
        String input;
        Double acumMen,acumTot,promMen,promTot;
        
        do{
        System.out.println("Ingrese la cantidad de personas");
        N=leer.nextInt();
        }while(N<1);
        Double[] personas=new Double[N];
        
        for (int i = 0; i < N; i++) {
            int pos=i+1;
            System.out.println("Ingrese la altura de la persona "+pos+"/"+N);
            input=leer.next();
            input = input.replace(",", ".");
            personas[i]=Double.parseDouble(input);
        }
        
        cantMen=0;
        acumMen=0.0;
        acumTot=0.0;
        for (int i = 0; i < N; i++) {
            if(personas[i]<1.6){
                cantMen++;
                acumMen+=personas[i];
            }
            acumTot+=personas[i];
        }
        
        if(cantMen>0){
            promMen=acumMen/cantMen;
            System.out.println("El promedio de personas de estatura menor a 1.6 es: "+promMen);
        }else{
            System.out.println("No hay personas con estaturas menores a 1,6m");
        }
        
        promTot=acumTot/N;
        System.out.println("El promedio de todas las estaturas es: "+promTot);
    }
}
