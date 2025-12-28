public class Secondlargest {
    public static void main(String[] args) {
        int[] arr={1,92,33,54,67};
        int fmax=arr[0],smax=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>fmax)
            {
                smax=fmax;
                fmax=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=fmax)
            {
                smax=arr[i];
            }
        }
        System.out.println("Second Maximum Element:"+smax);
    }
}
