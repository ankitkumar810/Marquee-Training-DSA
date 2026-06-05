package Array;

public class RotateArrays {
//    public static int[] rotate(int[] arr) {
//        int i = 0;
//        int j = arr.length - 1;
//        while(i>j){
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//        }
//    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

    }
    public static void main(String[] args) {

    }
}
