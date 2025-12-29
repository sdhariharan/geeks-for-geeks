import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,3,3};
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i : arr)
        {
            if(set.contains(i)){
            if(!set2.contains(i))
            {

                res.add(i);
                set2.add(i);
            }
        }
            else{
                set.add(i);
            }
        }
        for(int i : res)
        {
            System.out.print(i+" ");
        }


    }
}
