/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author frangimz
 */
public class Ej12{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String secuencia;
        int acumCor=0,acumInc=0;
        boolean flagEnd=false,valid;
        
        while(!flagEnd){
            System.out.println("Ingrese la secuencia");
            secuencia=leer.nextLine();
            System.out.println("secuencia ingresada: "+secuencia);
            valid=true;
            if(secuencia.length()!=5){
                valid=false;
                System.out.println("longitud incorrecta");
            }
            if(valid){
                if(!secuencia.substring(0,1).equals("X")){
                    valid=false;
                    System.out.println(secuencia.substring(0,1));
                    System.out.println("Inicio de secuencia incorrecto");
                }
                if(!secuencia.substring(4,5).equals("O")){
                    valid=false;
                    System.out.println("Final de secuencia incorrecto");
                }
                if(secuencia.equals("&&&&&")){
                    flagEnd=true;
                }
            }
            
            if(valid){
                acumCor++;
            }else{
                acumInc++;
            }
        }
        acumInc--; //le resto la secuencia para salir que suma al acumInc
        
        System.out.println("Cantidad de secuencias correctas: "+acumCor);
        System.out.println("Cantidad de secuencias incorrectas: "+acumInc);
        
    }
    
}
