package filters;

public class StringFilter implements Filter {
    @Override
    public Object apply(Object o) {
        if (o instanceof String) {
            return ((String) o).toUpperCase();
        }
        return o;
    }
}
