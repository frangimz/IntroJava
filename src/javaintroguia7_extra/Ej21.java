/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 * @author frangimz
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        int[][] notas=new int[10][4];
        double[] prom= new double[10];
        
        ingresoNotas(notas);
        calculoProm(notas,prom);
        
        System.out.println("Los promedios son:");
        mostrarProm(prom);
    }
    
    private static void ingresoNotas(int[][] notas){
        Scanner leer= new Scanner(System.in);
        String[] tipo=new String[4];
        tipo[0]="Tp 1";
        tipo[1]="Tp 2";
        tipo[2]="Parcial 1";
        tipo[3]="Parcial 2";
        
        for (int i = 0; i < 10; i++) {
            int pos=i+1;
            System.out.println("Ingrese notas del alumno "+pos+"/"+10);
            for (int j = 0; j < 4; j++) {
                int pos2=j+1;
                System.out.println("Nota "+tipo[j]);
                notas[i][j]=leer.nextInt();
            }
        }
    }
    
    private static void calculoProm(int[][] notas,double[] prom){
        for (int i = 0; i < 10; i++) {
            prom[i]=notas[i][0]*0.1+notas[i][1]*0.15+notas[i][2]*0.25+notas[i][3]*0.5;
        }
    }
    
    private static void mostrarProm(double[] prom){
        for (int i = 0; i < 10; i++) {
            int pos=i+1;
            System.out.print("Alumno "+pos+", Prom: "+prom[i]);
            if(prom[i]>=7){
                System.out.println(" (Aprobado)");
            }else{
                System.out.println(" (Desaprobado)");
            }
        }
    }
    
}
