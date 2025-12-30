public class Binarysearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
            int target=5;
            int low=0,high=arr.length-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(arr[mid]==target){
                    System.out.println(mid);
                    break;
                }
                else if(arr[mid]>low)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid+1;
                }
                }
        
    }
    
}
