public class Fractionhelp {
    public static  double calculateFraction(
            FractionCalculationAction action,
            Fraction firstFraction,
            Fraction secondFraction){
        double firstFractionValue = firstFraction.getValue();
        double secondFractionValue = secondFraction.getValue();
        switch(action){
            case SUM -> {
                return firstFractionValue + secondFractionValue;
            }
            case SUBTRACT -> {
                return firstFractionValue - secondFractionValue;
            }
            case DIVISION -> {
                return firstFractionValue / secondFractionValue;
            }
            case MULPICATION -> {
                return firstFractionValue * secondFractionValue;
            }
        }
        return 0;
    }
}
