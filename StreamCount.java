import java.util.Arrays;
import java.util.stream.Stream;;

public class StreamCount{
    public static void main()
    {
        long arr[]=new long[] {12,14,3,14,19,20};

        long count=Arrays.stream(arr).count();
        System.out.println("Count :"+ count);



        
    }
}