package silnia;

public class SilniaRecursive implements Silnia {
    public int generate(int requestProduct) {

        if(requestProduct <= 1) return 1;

        return generate(requestProduct-1)*requestProduct;
    }
}
