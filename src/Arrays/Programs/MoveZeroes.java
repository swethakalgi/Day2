package Arrays.Programs;

public class MoveZeroes {
    static void main(String[] args) {
        int[] arr = {4,0, 5, 0, 3};

        int index = 0; // position for next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
