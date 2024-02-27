package miPrincipal;
public class AppSumaDigitos {

          
    public static void menu(){
        System.out.println();
        System.out.println("====================");
        System.out.println("    Suma Dijitos    ");
        System.out.println("====================");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Proporciona numero");
        int n=scaner.nextInt();
        System.out.println("Vercion iterativa");
        System.out.println("Suma dijitos :"+SumaDijitosIte(n));
       
        System.out.println("Vercion recursiva");
        System.out.println("Suma dijitos :"+SumaDijitosRec(n));



}
public static void SumaDijitosIte(int n){
int suma = 0;
while(n>0){
    suma=suma + n%10;
    n= n/10;

}

return (suma+n);

}
public static void SumaDijitosRec(int n){
    if(n<=9)
    return n;
    else
    return SumaDijitosRec(n/10)+n%10;


}
}