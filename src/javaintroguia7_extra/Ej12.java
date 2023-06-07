/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;

/**
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
 * @author frangimz
 */
public class Ej12{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        String out,aux,aux2;
        
        while(cont<1000){
            if(cont<10){
                out="0-0-";
                aux=String.valueOf(cont);
                out= out+aux;
            }else{
                if(cont<100){
                    out="0-";
                    aux=String.valueOf(cont);
                    aux2=aux.replace("3","E");
                    out=out+aux2.charAt(0)+"-"+aux2.charAt(1);
                }else{
                    aux=String.valueOf(cont);
                    aux2=aux.replace("3","E");
                    out=aux2.charAt(0)+"-"+aux2.charAt(1)+"-"+aux2.charAt(2);
                }
            }
            System.out.println(out);
            cont++;
        }
        
    }
    
}
