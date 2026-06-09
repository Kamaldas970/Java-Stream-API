import java.util.List;
import java.util.stream.Stream;


public class TerminalforEach
{
    public static void main(String args[])
    {

        List<String>list=List.of("Kamal", "Ambadas", "Sandesh");
        Stream<String> data=list.stream();
        data.forEach(n->System.out.println(n));
    }
}