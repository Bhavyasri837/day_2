//swapping using temporary variable
import java.util.*;
public class swapping {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        String result=String.format("after swapping the values are \na=%d\nb=%d",a,b);
        System.out.println(result);


    }
    
}
