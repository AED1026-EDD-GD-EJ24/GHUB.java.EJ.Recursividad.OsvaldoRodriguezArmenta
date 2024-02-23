package miPrincipal;
public class AppLadrillo {

    public static void menu() {
        System.out.println("Version Iterativa ");
        dibujar_pared_ite(10);
        System.out.println("Version Recursiva ");
        dibujar_pared_rec(10);
    }
    public static void dibujar_pared_ite(int n){
        for(int i=0;i<n;i++){
            System.out.println("XXXXXXXXXXXXXXXXXXXXX");

        }

    }
    public static void dibujar_pared_rec(int n){
        if(n>0)
        dibujar_pared_rec(n-1);
        
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXX");
    }
}