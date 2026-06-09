import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamODD{
    public static void main(String[] args) 
    {
      List.of(2,5,3,4,8,2,5,3,10,14).stream().filter(n->n%2==1).map(n->n*2).distinct().collect(Collectors.toList()).forEach(n->System.out.println(n));
    }
}