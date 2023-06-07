/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;

/**
 *
 * @author frangimz
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[4][4];
        int[][] matrizT=new int[4][4];
        
        loadMatrizRandom(matriz);
        System.out.println("Matriz cargada aletoriamente");
        showMatriz(matriz);
        matrizT=traspuestaMatriz(matriz);
        System.out.println("Matriz Transpuesta");
        showMatriz(matrizT);
    }
    
    public static void loadMatrizRandom(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
    }
    
    public static void showMatriz(int[][] matriz){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static int[][] traspuestaMatriz(int[][] matriz){
        int[][] salida=new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                salida[j][i]=matriz[i][j];
            }
        }
        return salida;
    }
    
}
