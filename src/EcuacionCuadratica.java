import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ECUACION CUADRATICA");
        System.out.println("Ingrese el valor de a: ");
        double a = teclado.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        double b = teclado.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        double c = teclado.nextDouble();
        double exp = 2;
        double determinante = (Math.pow(b, exp)-4*a*c);
        System.out.println("La ecuacion no tiene solucion");
        double x1 = Math.sqrt((-b + determinante) /(2*a));
        double x2 = Math.sqrt((-b - determinante) /(2*a));
        System.out.println("x1 equivale a: " + x1);
        System.out.println("x2 equivale a: " + x2);
    }
}
