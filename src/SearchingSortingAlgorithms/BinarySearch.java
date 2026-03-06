package SearchingSortingAlgorithms;

public class BinarySearch {
    static int binarysearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = (start + end) / 2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int key=40;
        int result=binarysearch(arr,key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

    }
}