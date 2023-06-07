/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 * @author frangimz
 */
public class Ej22{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N,M;
        
        System.out.println("Vamos a rellenar una matriz NxM");
        do{
            System.out.println("Ingrese la cantidad de filas N");
            N=leer.nextInt();
        }while(N<0);
        do{
            System.out.println("Ingrese la cantidad de filas M");
            M=leer.nextInt();
        }while(M<0);
        
        int[][] matriz= new int[N][M];
        
        cargarMatriz(matriz,N,M);
        mostrarMatriz(matriz,N,M);
        
        sumaMatriz(matriz,N,M);
    }
    
    private static void cargarMatriz(int[][] matriz,int N,int M){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
    }
    
    private static void mostrarMatriz(int[][] matriz,int N,int M){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    private static void sumaMatriz(int[][] matriz,int N,int M){
        int suma=0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma+=matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de la matriz es: "+suma);
        
    }
    
}
