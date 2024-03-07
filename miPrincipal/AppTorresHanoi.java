package miPrincipal;
public class AppTorresHanoi{
    public static void menu(){
        System.out.println("*************************");
        System.out.println("TORRES DE HANOI");
        System.out.println("*************************");
        hanoi("DAFJKLHADF82384GHFBA834879HDSAF839", "FASJKEHR38978970 843HHF", "ASDFJHASJKDFH8327423789F", 100);
        
    
        
    }

    public static void hanoi(String varini, String varaux, String varfin, int n){
        if(n==1){
            System.out.println("Mover disco de " + varini + " a " + varfin);
        }else{
            hanoi(varini, varfin, varaux, n-1);
            System.out.println("Mover disco de " + varini + " a " + varfin);
            hanoi(varaux, varini, varfin, n-1);
        }
    }

}