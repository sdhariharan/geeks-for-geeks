public class Largest_Element_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int max=0;
        for(int i :arr)
        {
            if(i>max)max=i;
        }
        System.out.println("Maximum Element In an Array :"+max);
    }
    
}
