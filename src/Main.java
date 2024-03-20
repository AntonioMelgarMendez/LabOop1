//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static double Add(double a, double b) {
        return a + b;
    }
    public static double Substract(double a, double b) {
        return a - b;
    }
    public static double Multiply(double a, double b) {
        return a * b;
    }
    public static double Divide(double a, double b) {
        return a /b;
    }
    public static void main(String[] args) {
        boolean outcondition= true;

        do {

            System.out.printf("--------Menu--------");
            System.out.printf("1.Sumar                ");
            System.out.printf("2.Restatr                ");
            System.out.printf("3.Multiplicar                ");
            System.out.printf("4.Dividir                ");
            System.out.printf("5.Salir                ");
            Scanner sc = new Scanner(System.in); // Instanciación de la clase Scanner
            int condition = sc.nextInt();
            System.out.printf("Inserte valor B:");
            Scanner sc1 = new Scanner(System.in); // Instanciación de la clase Scanner
            int a = sc1.nextInt(); /// Leyendo una línea de texto
            System.out.printf("Inserte valor B:");
            Scanner sc2 = new Scanner(System.in); // Instanciación de la clase Scanner
            int  b= sc2.nextInt(); /// Leyendo una línea de texto
            String result;
            switch (condition) {
                case 1:

                    System.out.printf("total:"+Add(a,b));

                    break;
                case 2:

                    System.out.printf("total:"+Substract(a,b));
                    break;
                case 3:

                    System.out.printf("total:"+Multiply(a,b));
                    break;
                case 4:

                    System.out.print("total:"+Divide(a,b));
                    break;
                case 5:
                    System.out.printf("Saliendo");
                    outcondition=false;
                    break;
                default:
                    System.out.printf("Valor incorrecto inserte de nuevo");
                    break;
            }


        }
        while(outcondition);


    }

}
