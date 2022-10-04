import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner temperatura = new Scanner(System.in);

        System.out.println("Quantos graus Fahrenheit está fazendo?");
        float temp = temperatura.nextFloat();

        Float C = 5 * ((temp - 32) / 9);

        System.out.println("Em Celsius a temperatura equivale a :" + C);

    }
}