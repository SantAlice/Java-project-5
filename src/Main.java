package src;

import src.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
                double kilograms = 55;
                double meters = 1.77;
                double bmiIndex = service.calculate(kilograms,meters);
        System.out.println((int)bmiIndex);
    }
}
