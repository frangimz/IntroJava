/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author frangimz
 */
public class Ej17{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n;
        
        System.out.println("Ingresar cuantos numero quiere ingresar");
        n=leer.nextInt();
        
        int[] vect= new int[n] ;
        
        loadVectManual(vect);
        
        contCifras(vect);
    }
    
    public static void loadVectManual(int[] vect){
        Scanner leer=new Scanner(System.in);
        
        for (int i = 0; i < vect.length; i++) {
            int pos=i+1;
            System.out.println("Ingrese el numero "+pos+"/"+vect.length);
            vect[i]=leer.nextInt();
        }
    }
    
    public static void contCifras(int[] vect){
        int cont;
        int aux;
    
        for (int i = 0; i < vect.length; i++) {
            cont=0;
            aux=vect[i];
            while(aux>9){
               cont++;
               aux/=10;
               //aux= (int) Math.round(aux);
            }
            cont++;
            System.out.println("El numero "+vect[i]+" tiene "+cont+" cifras.");
        }
    }
    
}
