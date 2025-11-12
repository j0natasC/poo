import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triangulo X");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y");

        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = xA + xB + xC / 2.0;
        double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));

        p = yA + yB + yC / 2.0;
        double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));

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