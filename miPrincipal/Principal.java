package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("       RECURSIVIDAD       ");
            System.out.println("*************************");
            System.out.println("1) LADRILLOS");
            System.out.println("2) FACTORIAL");
            System.out.println("3) NUMEROS NATURALES");
            System.out.println("4) SUMA DIGITOS");
            System.out.println("5) RECURSIVIDAD INDIRECTA");
            System.out.println("6) MAXIMO COMUN DIVISOR");
            System.out.println("7) BUSQUEDA BINARIA");
            System.out.println("8) ORDENAMIENTO POR SELECCION");
            System.out.println("9) TORRES DE HANOI");
            System.out.println("10) SERIE DE FIBONACCI");
            System.out.println("11) PERFORMANCE SERIE DE FIBONACCI ");
            System.out.println("12) ORDENAMIENTO POR MEZCLA");
            System.out.println("                             ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){

            case 1:
               AppLadrillo.menu();
               break;
               
            case 2:
               AppFactorial.menu();
               break;
            case 3:
               AppNatural();
               break;
            case 4:
            break;
            case 5:
            break;
            case 6:
            break;
            case 7:
            break;
            case 8:
            break;
            case 9:
            break;
            case 10:
            break;
            case 11:
            break;
            case 12:
            break;
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}