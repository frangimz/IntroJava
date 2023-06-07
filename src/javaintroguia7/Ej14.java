/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * @author frangimz
 */
public class Ej14{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        double val;
        String moneda;
        
        System.out.println("Ingrese valor en euro");
        val=leer.nextDouble();
        
        do{
        System.out.println("Ingrese la moneda a convertir (dolares/yenes/libras)");
        leer.nextLine();//limpiando buffer
        moneda= leer.nextLine();
        }while(!moneda.equals("dolares")&&!moneda.equals("yenes")&&!moneda.equals("libras"));
        
        System.out.println(convEuro(val,moneda)+" "+moneda+"es equivalente a "+val+" euros");
    
        leer.close();
    }
    
    public static double convEuro(double val,String moneda){
        double salida=0.0;
        if(moneda.equals("libras")){
            salida= val*0.86;
        }
        if(moneda.equals("yenes")){
            salida= val*129.852;
        }
        if(moneda.equals("dolares")){
            salida= val*1.28611;
        }
        return salida;
    }
    
}
