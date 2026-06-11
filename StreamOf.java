import java.util.stream.Stream;
import java.util.List;

public class StreamOf{
  public  static void main(String args[])
    {
        Stream.of(1,2,3,4,7,9,12).filter(n->n%3==0).forEach(System.out::println);
    }
}