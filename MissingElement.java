public class MissingElement {
    public static void main(String[] args) {
        
    int sum=0;
    int[] arr={1,2,3,5};
    int n=arr.length+1;
    int tot=n*(n+1)/2;
    for(int i=0;i<n-1;i++)
    {
        sum+=arr[i];
    }

    int missing_element=(tot>sum)?tot-sum:sum-tot;
    System.out.println("Missing Element:"+missing_element);
}
    
}
