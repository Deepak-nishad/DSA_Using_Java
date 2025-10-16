package sorting;


public class Main
{
    
static public int binarySearch(int[] arr, int k) {
        // Code Here
     
        int low=0;
        int high=(arr.length);
           int mid=-1;//=(low+high)/2;
        int flag=0;
        while(low < high)
        {
        	 mid=(low+high)/2;
            if(arr[mid]==k){
                flag=1;
                break;
            }
             else if(k<arr[mid]){
                high=mid-1;
            }
             else if(k > arr[mid]){
                low=mid+1;
            }
            
            
            
        }
        if(flag==1){
            return mid;
        }
       return -1;
        
    }
	public static void main(String[] args) {
	    int[] numbers = {1,2,3,4,5};
        int target = 3;

        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

	}
}
