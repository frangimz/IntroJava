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
public class Ej11{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        String frase;
        
        do{
        System.out.println("Ingrese una frase terminada en punto");
        frase=leer.nextLine();
        }while(frase.charAt(frase.length()-1)!='.');
        
        System.out.println("La frase es: "+frase);
        
        System.out.println("frase codificada : "+codificador(frase));
        System.out.println("frase codificada2: "+codificador2(frase));
        
        leer.close();
    }
    public static String codificador(String frase){
        int i=0;
        char[] fraseArreglo=frase.toCharArray();
        String fraseOut;

        while(i<frase.length()){
            fraseArreglo[i]=frase.charAt(i);
            switch(fraseArreglo[i]){
                case 'a':
                    fraseArreglo[i]='@';
                    break;
                case 'e':
                    fraseArreglo[i]='#';
                    break;
                case 'i':
                    fraseArreglo[i]='$';
                    break;
                case 'o':
                    fraseArreglo[i]='%';
                    break;
                case 'u':
                    fraseArreglo[i]='*';
                    break;
                default:
                    break;
            }
            i++;
        }

        fraseOut = new String(fraseArreglo);
        
        return fraseOut;
    }
    public static String codificador2(String frase){
        String fraseOut;
        int i=0;
        fraseOut="";
        
        while(i<frase.length()){
            switch(frase.charAt(i)){
                case 'a':
                    fraseOut=fraseOut.concat("@");
                    break;
                case 'e':
                    fraseOut=fraseOut.concat("#");
                    break;
                case 'i':
                    fraseOut=fraseOut.concat("$");
                    break;
                case 'o':
                    fraseOut=fraseOut.concat("%");
                    break;
                case 'u':
                    fraseOut=fraseOut.concat("*");
                    break;
                default:
                    fraseOut=fraseOut.concat(String.valueOf(frase.charAt(i)));
                    break;
            }
            i++;
        }
        
        return fraseOut;
    }
}

