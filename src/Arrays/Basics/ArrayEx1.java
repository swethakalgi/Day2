package Arrays.Basics;

public class ArrayEx1 {
    static void main(String[] args) {
//        int[] arr;// 4Bytes gets allocated to 1 variable
//        int[] arr2= new int[5];
        int[] arr1 = {1,2,3,4,5};// heap memory is allocated for creating an array
        for (int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
