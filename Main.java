import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstNumerator = scanner.nextDouble();
        double firstDenomerator = scanner.nextDouble();

        double secoondNumerator = scanner.nextDouble();
        double secondDenomerator = scanner.nextDouble();

        System.out.println(
                (firstNumerator/firstDenomerator) + (secoondNumerator/secondDenomerator)
        );
        System.out.println(
                (firstNumerator/firstDenomerator) - (secoondNumerator/secondDenomerator)
        );
        System.out.println(
                (firstNumerator/firstDenomerator) * (secoondNumerator/secondDenomerator)
        );
        Fraction firstFraction = new Fraction(firstNumerator, firstDenomerator);
        Fraction secondFraction = new Fraction(secoondNumerator, secondDenomerator);
        System.out.println(
                Fractionhelp.calculateFraction(FractionCalculationAction.SUM, firstFraction, secondFraction)
        );

    }
}
