import java.util.List;
import java.util.stream.Stream;

public class StreamGenerate{
    public static void main(String args[])
    {
        Stream.generate(()->"hi").limit(4).forEach(System.out::println);
    }
}