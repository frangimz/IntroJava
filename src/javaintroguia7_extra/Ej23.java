/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaintroguia7_extra;
import java.util.Scanner;

/**
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 * @author frangimz
 */
public class Ej23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int contPal=0;
        String pal;
        int[] posPal=new int[5];
        int numPosRandom,randomColumn;
        
        String[][] sopa=new String[20][20];
        initMatriz(sopa,20,20);
        initPosPal(posPal);
        
        while(contPal<5){
        
        System.out.println("Vamos a llenar la matriz");
        do{
            System.out.println("Ingrese la palabra "+contPal+"/5");
            pal=leer.next();
        }while(pal.length()<3 || pal.length()>5);
        
        do{
            numPosRandom=(int)(Math.random()*19);
        }while(verifPal(numPosRandom,posPal));
        
        posPal[contPal]=numPosRandom;
        
        randomColumn=(int)(Math.random()*(19-pal.length()));
        
        for (int i = 0; i < pal.length(); i++) {
            sopa[numPosRandom][randomColumn+i]=pal.substring(i,i+1);
        }
        
        mostrarMatriz(sopa,20,20);
        contPal++;
        }
        
        rellenarMatriz(sopa,20,20);
        
        System.out.println("Finalmente tenemos");
        mostrarMatriz(sopa,20,20);
        
    }
    
    private static void initMatriz(String[][] sopa,int N,int M){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sopa[i][j]=" ";
            }
        }
    }
    
    private static void initPosPal(int[] posPal){
        for (int i = 0; i < 5; i++) {
            posPal[i]=-1;
        }
    }
    
    private static boolean verifPal(int numPosRandom,int[] posPal){
        boolean out=false;
        
        for (int i = 0; i < 5; i++) {
            if(numPosRandom==posPal[i]){
                out=true;
            }
        }
        
        return out;
    }
    
    private static void mostrarMatriz(String[][] sopa,int N, int M){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("["+sopa[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    private static void rellenarMatriz(String[][] sopa,int N, int M){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(sopa[i][j].equals(" ")){
                    int numrand=(int)(Math.random()*10);
                    sopa[i][j]=Integer.toString(numrand);
                }
            }
        }
    }
}
