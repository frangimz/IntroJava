/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author frangimz
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[3][3];
        int[][] matrizT=new int[3][3];
        
        loadMatrizManual(matriz);
        System.out.println("Matriz cargada manualmente");
        showMatriz(matriz);
        matrizT=traspuestaMatriz(matriz);
        System.out.println("Matriz Transpuesta");
        showMatriz(matrizT);
        System.out.println("La matriz es antisimétrica?");
        System.out.println(verifAntiSimetrica(matriz,matrizT));
        
    }
    
    public static void loadMatrizManual(int[][] matriz){
        Scanner leer=new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor de pos ["+i+"]["+j+"]: ");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    
    public static void showMatriz(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] traspuestaMatriz(int[][] matriz){
        int[][] salida=new int[4][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                salida[j][i]=matriz[i][j];
            }
        }
        return salida;
    }
    
    public static boolean verifAntiSimetrica(int[][] matriz,int[][] matrizT){
        boolean out=true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]!=(matrizT[i][j]*-1)){
                    out=false;
                }                    
            }
        }
        return out;
    }
    
}
