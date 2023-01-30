import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Rate: ");
        double rate = (scanner.nextDouble() / 100)/12;
        System.out.print("Period (Years): ");
        int period = (scanner.nextInt() * 12);

        double mortgage = principal * (rate * (Math.pow((1 + rate), period))) / (Math.pow((1 + rate), period) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Your mortgage payment will be " + currency.format(mortgage));

    }
}