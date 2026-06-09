import java.util.List;
import java.util.stream.Stream;

public class OptimizedforEachInt{
    public static void main(String[] args)
    {
    List.of(2,5,7,3,9,10).stream().sorted().forEach(n->System.out.println(n));
    }
}