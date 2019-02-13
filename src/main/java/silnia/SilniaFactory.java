package silnia;

public class SilniaFactory {
    public static  Silnia produce(SilniaType type){
        if(SilniaType.RECURSIVE.equals(type)){
            return new SilniaRecursive();
        }
        if(SilniaType.ITERATIONAL.equals(type)){
            return new SilniaIterational();
        }
        return null;
    }



}
