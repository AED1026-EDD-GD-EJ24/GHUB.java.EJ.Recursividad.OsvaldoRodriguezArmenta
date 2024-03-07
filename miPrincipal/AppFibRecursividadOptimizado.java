package miPrincipal;

import java.util.Hashtable;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class AppFibRecursividadOptimizado{
   public static void menu() {
    System.out.println("===================================");
    System.out.println("===== Fibonacci Optimizado ========");
    System.out.println("===================================");
    Hashtable<Integer,Double>t = new Hashtable<Integer,Double>();
    t.put(1, 1d);
    t.put(2, 1d);
    Scanner scanner = new Scanner(System.in);
    System.out.println("¿Cuantos terminos quiere ver?:");
    int n = scanner.nextInt();
    for(int i=1;i<=n;i++){
        double f=AppFibonacci.AppFibRecursividadOptimizado(i, t);
        System.out.println("fib("+i+")="+f);
    }

   }


}