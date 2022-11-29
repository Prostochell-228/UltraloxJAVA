public class Fraction {
    private double numerator;
    private double denumarator;

    public Fraction(double numerator,double denumarator) {
        this.denumarator = denumarator;
        this.numerator = numerator;
    }
    public double getValue(){
        return numerator/denumarator;
    }

}
