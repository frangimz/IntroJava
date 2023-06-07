/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 * @author frangimz
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        func();
    }
         
    private static void func(){
        Scanner leer=new Scanner(System.in);
        int N;
        String opc;
        
        System.out.println("Ingrese la cantidad de personas que va a ingresar");
        N=leer.nextInt();
        
        int[] edad=new int[N];
        String[] nombre= new String[N];
        
        for (int i = 0; i < N; i++) {
            //Limpiamos Buffer
            leer.nextLine();
            int pos=i+1;
            System.out.println("Persona "+pos+"/"+N);
            System.out.println("Ingrese el nombre");
            nombre[i]=leer.nextLine();
            System.out.println("Ingrese la edad");
            edad[i]=leer.nextInt();
        }   
        
        System.out.println("Mostrando Personas");
        int i=0;
        do{
            int pos=i+1;
            System.out.println("Persona "+pos+": "+nombre[i]+" ("+edad[i]+")");
            if(i<N-1){
                System.out.println("Desea ver la siguiente persona?(Si/No)");
                opc=leer.next();
            }else{
                opc="No";
            }
            i++;
        }while(!opc.equals("No")&& i<N);
        
    }
}
