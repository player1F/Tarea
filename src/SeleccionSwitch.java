import java.util.Scanner;

/**
 * Programa para devolver el dia de la semana en palabras dado un numero del 1 al 7
 * Programa creado por player1F
 */
public class SeleccionSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("LUNES");
                break;//salta al final de la estructura switch
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Opcion Incorrecta");
        }
        System.out.println("Fin del switch");
    }
}
