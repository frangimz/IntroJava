/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 * @author frangimz
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        int N,M,auxAcum,acumEdadTot=0,cantTot=0;
        
        System.out.println("Ingrese la cantidad de familias");
        N=leer.nextInt();
        
        
        for (int i = 0; i < N; i++) {
            int pos=i+1;
            System.out.println("Ingrese la cantidad de hijos de la familia "+pos+"/"+N);
            M=leer.nextInt();
            auxAcum=0;
            for (int j = 0; j < M; j++) {
                int pos2=j+1;
                System.out.println("Ingrese la edad del hijo "+pos2+"/"+M);
                auxAcum+=leer.nextInt();
            }
            acumEdadTot+=auxAcum;
            cantTot+=M;
            System.out.print("La media de edad esta familia es: ");
            System.out.println((float)auxAcum/M);
        }
        
        System.out.print("La media de todas las edades es: ");
        System.out.println((float)acumEdadTot/cantTot);
    }
    
}
