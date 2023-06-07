/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7;
import java.util.Scanner;

/**
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 * @author frangimz
 */
public class Ej21{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz=new int[10][10];
        int[][] matriz2=new int[3][3];
        
        loadMatrizRandom(matriz,10,10);
        System.out.println("Matriz cargada aleatoriamente");
        showMatriz(matriz,10,10);
        System.out.println("Ingreso matriz 3x3");
        loadMatrizManual(matriz2,3,3);
        
        verifInc(matriz,10,10,matriz2,3,3);
        
        
    }
    
    public static void loadMatrizRandom(int[][] matriz,int n,int m){     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int) (Math.random()*100);
            }
        }
    }
    
    public static void loadMatrizManual(int[][] matriz,int n,int m){
        Scanner leer=new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese valor de pos ["+i+"]["+j+"]: ");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    
    public static void showMatriz(int[][] matriz,int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static void verifInc(int[][] matriz,int n,int m,int[][] matriz2,int n2,int m2){
        int cont=0;
        boolean flagInc,flagExistInc=false;
        int posX=0,posY=0;
        int k,l;
        
        for (int i = 0; i < n-n2+1; i++) {
            for (int j = 0; j < m-m2+1; j++) {
                if(matriz[i][j]==matriz2[0][0]){
                    System.out.println("Coincide primer pos en coord: "+i+","+j);
                    flagInc=true;
                    k=0;
                    while(k < n2 && flagInc) {
                        l=0;
                        while(l < m2 && flagInc){
                            if(matriz[i+k][j+l]!=matriz2[k][l]){
                                flagInc=false;
                            }
                            l++;
                        }
                        k++;
                    }
                    if(flagInc==true){
                        flagExistInc=true;
                        //guardo la primera posicion de la primera matriz que encuentre
                        if(cont==0){
                            posX=i;
                            posY=j;
                        }
                        cont++;
                    }
                }
            }
        }
        
        if(flagExistInc){
            System.out.println("Existe una inclusion de la 3x3 en la matriz 10x10");
            System.out.println("La posicion de primer elemento de matriz es");
            System.out.println("pos x: "+posX+",pos y: "+posY);
            System.out.println("Existen "+cont+" matrices que incluye");
        }else{
            System.out.println("No la incluye a la matriz");
        }
    }
    
}
