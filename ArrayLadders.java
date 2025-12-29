import java.util.ArrayList;
import java.util.Collections;

public class ArrayLadders {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        res.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(max<arr[i])
            {
                max=arr[i];
                res.add(max);

            }
        }
        Collections.reverse(res);
        for(int i : res)
        {
            System.out.print(i+" ");
        }
    }
    
}
