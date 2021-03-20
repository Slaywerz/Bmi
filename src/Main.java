import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        Scanner in = new Scanner(System.in);

        System.out.print("Пожалуйста, введите ваш вес: ");
        double weight = in.nextDouble();

        System.out.print("Пожалуйста, введите ваш рост: ");
        double growth = in.nextDouble();

        double bmi = service.calculate(weight, growth);
        System.out.printf("%.2f", bmi);
    }
}