package miPrincipal;
public class Alfabeto {

    public static void menu() {
        System.out.println(" ");
        metodo ('Z');
        System.out.println(" ");

    
        
    }
    static void metodoA(char c){
        if(c>'A')
        metodo(c);
        System.out.println(c);
    }
    static void metodoB(char c){
        metodo(--c);
    } 
}