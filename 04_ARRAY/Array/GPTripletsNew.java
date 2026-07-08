package array;

public class GPTripletsNew {
    public static void findTriplets(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                for(int k = j + 1; k < arr.length; k++) {
                    if(arr[j] * arr[j] == arr[i] * arr[k]) {
                        System.out.println(
                            "(" + arr[i] + ", " +
                            arr[j] + ", " +
                            arr[k] + ")"
                        );
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 8, 10, 15, 16, 30, 32, 64};
        System.out.println("GP Triplets are:");
        findTriplets(arr);
    }
}
