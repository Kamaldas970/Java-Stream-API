import java.util.Arrays;
import java.util.stream.IntStream;


public class ArraysStream{
   public static void main(String args[])
    {
        int arr[]=new int[]{1,3,5,6,8,12,2,12,5,1};
    Arrays.stream(arr).filter(n->n%2==0).distinct().forEach(System.out::println);
    }
}