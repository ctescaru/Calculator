public class TestCalculator {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculatorImpl();
        ExpertCalculator expertCalculator = new ExpertCalculatorImpl();
        ExpertCalculator expertCalculator1 = new ExpertCalculatorImpl(3);

        /*System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.multiply(1,2,3));*/

        System.out.println(expertCalculator.evaluate("2+3"));
        System.out.println(expertCalculator.evaluate("4-2"));
        System.out.println(expertCalculator.evaluate("4*2"));
        System.out.println(expertCalculator.evaluate("4/2"));
        System.out.println(expertCalculator.evaluate("2+3+4"));
        System.out.println(expertCalculator.evaluate("2+3*4"));
        System.out.println(expertCalculator.evaluate("(2+3)*5"));
    }
}
