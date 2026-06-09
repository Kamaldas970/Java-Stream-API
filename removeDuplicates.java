import java.util.stream.Stream;
import java.util.List;

public class removeDuplicates{
    public static void main(String args[])
    {
        List.of(2,3,1,5,7,4,1,1,6,8,4,5).stream().distinct().forEach(n->System.out.println(n));
    }
}