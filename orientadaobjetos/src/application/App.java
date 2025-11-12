package application;
import java.util.Scanner;

import entidades.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triangulo X");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y");

        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double p = x.a + x.b + x.c / 2.0;
        double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));

        p = y.a + y.b + y.c/ 2.0;
        double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);

        if (areaX <= areaY)   {
            System.out.println("Area Y é maior ");
        } else {
            System.out.println("Area X é maior");
        }


        scan.close();;
    }
}