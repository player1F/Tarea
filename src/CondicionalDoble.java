import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("Ingrese su edad");
        int edad = teclado.nextInt();
        boolean evaluacion = (edad >= 18);
        if (evaluacion){
            System.out.println("Eres mayor de edad");
            System.out.println("Estas casi listo para ir a la Universidad");
        }else{
            System.out.println("Aun eres menor de edad");
        }
    }
}
