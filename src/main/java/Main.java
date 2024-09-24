import filters.IntegerFilter;
import filters.StringFilter;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Object[] doubledNumbers = ArrayFilterMethod.filter(numbers, new IntegerFilter());

        for (Object number : doubledNumbers) {
            System.out.println(number);
        }

        String[] names = {"Alex", "Peter", "Darya", "Eugenyi", "Jenya"};
        Object[] namesInUpperCase  = ArrayFilterMethod.filter(names, new StringFilter());

        for (Object string : namesInUpperCase) {
            System.out.println(string);
        }
    }
}
