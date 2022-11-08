import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        System.out.println("valor de PI: "+ Math.PI);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcular Areas:\n");
        int area = teclado.nextInt();
        switch (area){
            case 1:
                System.out.println("Ingrese base\n");
                double b = teclado.nextInt();
                System.out.println("Ingrese altura\n");
                double h = teclado.nextInt();
                double a = b * h /2;
                System.out.println("Area de un Triangulo es:\n"+a);
                break;
            case 2:
                System.out.println("Ingrese Radio\n");
                double r = teclado.nextInt();
                double a2 = Math.PI * r * r;
                System.out.println("Area de un Circulo es:\n"+ a2);
                break;
            case 3:
                System.out.println("Ingrese Lado\n");
                double l = teclado.nextInt();
                double a3 = l * l;
                System.out.println("Area de un Cuadrado"+a3);
            default:
                System.out.println("No existe");
      }
        System.out.println("Fin del switch");
    }
}
