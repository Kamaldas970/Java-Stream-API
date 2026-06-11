import java.util.List;
import java.util.stream.Stream;


public class startWith{
    public static void main(String args[])
    {
     List.of("Kamal", "Sandesh", "Suresh", "Swaraj").stream().filter(n->n.startsWith("S")).forEach(System.out::println);
    }
}