package miPrincipal;
public class AppFactorial {
    public static void menu(){
        System.out.println("Version Iterativa");
        int n=5;
        System.out.println("Factorial de "+n+"i="+factorial_ite(n));
        System.out.println("Version Recursiva");
        System.out.println("Factorial de "+n+"i="+factorial_rec(n));
        

    }
    public static long factorial_ite(int n){
        long fact=1;
        for(int i=1;i>0;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static long factorial_rec(int n){
        if(n==0)
        return 1;
        return factorial_rec(n-1)*n;
    }
    }

    

