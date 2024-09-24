package filters;

public class IntegerFilter implements Filter {
    @Override
    public Object apply(Object o) {
        if (o instanceof Integer) {
            return ((Integer) o) * 2;
        }
        return o;
    }
}
