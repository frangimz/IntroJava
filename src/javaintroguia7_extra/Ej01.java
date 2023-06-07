/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author frangimz
 */
public class Ej01 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int time,contDays=0,contHours=0,contMins=0;
        
        System.out.println("Ingrese el tiempo el minutos");
        time=leer.nextInt();
        
        contHours=(int)time/60;
        contMins=time-contHours*60;
        
        if(contHours>24){
            contDays=(int)contHours/24;
            contHours-=contDays*24;
        }
        
        System.out.println(time+" es equivalente a: "+contDays+" dia/s, "+contHours+" hora/s y "+contMins+" minuto/s");
    }
}