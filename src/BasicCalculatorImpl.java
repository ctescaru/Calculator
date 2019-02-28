import java.math.BigDecimal;
import java.math.RoundingMode;

public class BasicCalculatorImpl implements BasicCalculator {
    private Integer floatingPointNumber;

    public BasicCalculatorImpl(){
        floatingPointNumber = 10;
    }

    public BasicCalculatorImpl(Integer precision){
        this.floatingPointNumber = precision;
    }

    public Integer getFloatingPointNumber(){
        return floatingPointNumber;
    }

    @Override
    public Long add(Integer... array) {
        Long sum = 0L;
        for (Integer i: array) {
            sum+=i;
        }
        return sum;
    }

    @Override
    public Long add(Long... array) {
        Long sum = 0L;
        for (Long i: array) {
            sum+=i;
        }
        return sum;
    }

    @Override
    public Double add(Double... array) {
        Double sum = 0d;
        for (Double d: array) {
            sum+=d;
        }
        return setPrecision(sum);
    }

    @Override
    public Long multiply(Integer... array) {
        Long product = Long.valueOf(1);
        for (Integer i: array) {
            product*=i;
        }

        return product;
    }

    @Override
    public Long multiply(Long... array) {
        Long product = Long.valueOf(1);
        for (Long i: array) {
            product*=i;
        }

        return product;
    }

    @Override
    public Double multiply(Double... array) {
        Double product = 1d;
        for (Double i: array) {
            product*=i;
        }

        return product;
    }

    @Override
    public Integer subtract(Integer... array) {
        Integer sum=0;
        for(int i=1;i<array.length;i++){
            sum-=array[i];
        }
        return sum;
    }

    @Override
    public Long subtract(Long... array) {
        Long sum = 0L;
        for (int i = 1; i<array.length;i++) {
            sum-=array[i];
        }
        return sum;
    }

    @Override
    public Double subtract(Double... array) {
        Double sum =0d;
        for (int i=1;i<array.length;i++){
            sum-=array[i];
        }
        return sum;
    }

    @Override
    public Double divide(Integer... array) {
        return null;
    }

    @Override
    public Double divide(Long... array) {
        return null;
    }

    public Double setPrecision(Double x){
        return BigDecimal.valueOf(x)
                .setScale(floatingPointNumber, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
