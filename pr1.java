import java.util.*;
import java.util.stream.Stream;

public class pr1{
    public static void main(String args[])
    {
       List.of(1,3,4,5,8).stream().map(n->n*n).forEach(System.out::println);
    }
}