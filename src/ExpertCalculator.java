public interface ExpertCalculator extends BasicCalculator {
    Long pow(Integer x, Integer n);

    Double root(Integer x, Integer n);

    Long factorial(Integer n);

    Double evaluate(String expression);
}