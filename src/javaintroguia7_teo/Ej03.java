/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_teo;

/**
 *
 * @author frangimz
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val1=20,val2=50,suma,resta;
        boolean may, igual;
        short cont=0,descont=100;
        
        //probando operadores aritméticos
        suma=val1+val2;
        resta=val1-val2;
        //probando operadores unitarios
        cont++;
        descont--;
        //probando operadores condicionales
        may= val1>val2;
        igual= val1==val2;
        
        System.out.println("Suma: "+suma+" ,Resta:"+resta);
        System.out.println("Contador: "+cont+" ,Descontador: "+descont);
        System.out.println("Val1 es mayor a val2?: "+may);
        System.out.println("Val1 es igual a Val2?: "+igual);
    }
    
}
