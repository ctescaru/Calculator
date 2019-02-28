public interface BasicCalculator {
    Long add(Integer... array);
    Long add(Long... array);
    Double add(Double... array);

    Long multiply(Integer... array);
    Long multiply(Long... array);
    Double multiply(Double... array);

    Integer subtract(Integer... array);
    Long subtract(Long... array);
    Double subtract(Double... array);

    Double divide(Integer... array);
    Double divide(Long... array);
}
