package src;

public class BmiService {

    public double calculate(double kilograms, double meters) {
        double index = kilograms / (meters * meters);
        int result = (int) index;
        return result;
    }

}