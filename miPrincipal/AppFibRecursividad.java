package miPrincipal;
public class AppFibRecursividad {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("====================================================");
        System.out.println("====== Optimizacion de Fibonacci Recursivo ==========");
        System.out.println("====================================================");
        Performance p = new Performance();
        int desde=40;
        int hasta=50;
        double ant=-1;
        for(int i=desde;i<hasta;i++){
            p.start();
            double f=AppFibonacci.fibonacciRec(i);
            p.stop();
            System.out.println("f("+i+")= "+f+", "+p.getMillis()+"ms, "+AppFibonacci.getContador()+"veces");
            if(ant>=0){
                System.out.println("Incr ="+f/ant);
            }else{
                System.out.println();
                ant=f;
            }
        }
    }
}