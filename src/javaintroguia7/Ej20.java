/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
 *
 * @author frangimz
 */
public class Ej20{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[3][3];
        
        loadMatrizManual(matriz);
        System.out.println("Matriz cargada manualmente");
        showMatriz(matriz);
        
        System.out.println("La matriz es mágica?");
        System.out.println(verifMagic(matriz));
        
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
    
    public static boolean verifMagic(int[][] matriz){
        boolean out=true;
        int sumaFila=0,cont,sumaDiagonal=0,cont2,sumaDiagonal2=0;
        
        //suma primera fila
        for (int j = 0; j < 3; j++) {
            sumaFila+=matriz[0][j];
        }
        
        for (int i = 0; i < 3; i++) {
            cont=0;
            cont2=0;
            for (int j = 0; j < 3; j++) {
                cont+=matriz[i][j];
                cont2+=matriz[j][i];
                if(i==j){
                    sumaDiagonal+=matriz[i][j];
                    sumaDiagonal2+=matriz[i][3-1-j];
                }
            }
            //verificacion suma fila
            //System.out.println("suma fila "+i+": "+cont);
            if(cont!=sumaFila){
                out=false;
            }
            //verificacion suma columnas
            //System.out.println("suma columna "+i+": "+cont2);
            if(cont2!=sumaFila){
                out=false;
            }
        }
        
        //verificacion de suma de diagonal principal
        //System.out.println("suma diag principal: "+sumaDiagonal);
        if(sumaDiagonal!=sumaFila){
            out=false;
        }
        //verificacion de suma de diagonal secundaria
        //System.out.println("suma diag secundaria: "+sumaDiagonal2);
        if(sumaDiagonal!=sumaFila){
            out=false;
        }
        
        return out;
    }
    
}
