package miPrincipal;
import java.util.Scanner;
public class AppNatural {
    public static void menu(){
        System.out.println("=========================");
        System.out.println("     NUMEROS NATURALES   ");
        System.out.println("=========================");
        Scanner scaner=new Scanner(System.in);
        int n = scaner.nextInt();
        System.out.println("Version Iterativa");
        muestraNaturalesIte(n);
        System.out.println("Version Recursiva");
        muestraNaturalesRec(n);

    }
    public static void muestraNaturalesIte(int n) {
        System.out.println("");
        for(int i=0;i<=n;i++){
            System.out.println(i+" ");

        }
        
    }
    public static void muestraNaturalesRec(int n){
        if(n>0)
            muestraNaturalesRec(n-1);
            System.out.println(n+" ");
            System.out.println();
    }
}