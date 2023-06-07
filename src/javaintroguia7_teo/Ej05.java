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
public class Ej05{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int var1Int;        
        String var2Str;
        
        boolean var1;
        double var2;
        String var3;
        
        var1=true;
        
        do{
        System.out.println("Ingrese la variable boolean (0 para False y 1 para True)");
        var1Int=leer.nextInt();
        }while(var1Int!=0 && var1Int!=1);
            
        if(var1Int==0){
        var1=false;
        }
        
        if(var1Int==1){
        var1=true;
        }
        
            
        System.out.println("Ingrese la variable double");
        var2Str=leer.next();
        var2=Double.parseDouble(var2Str);
        
        System.out.println("Ingrese la variable char");
        var3=leer.next();
        
        System.out.println("Imprimimos lo ingresado");
        System.out.println("var1= "+var1);
        System.out.println("var2= "+var2);
        System.out.println("var3= "+var3.charAt(0));
        
        
    }   
    
}
