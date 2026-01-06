public class frequencyOfelementInLA {
    public static void main(String[] args) {
        int[] arr={2,3,2,3,5};
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            res[arr[i]-1]++;
        }
        for(int i :res)
        {
            System.out.println(i);
        }
    }
}
