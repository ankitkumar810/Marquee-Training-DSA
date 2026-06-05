package Array;

public class PrintAllSubArray {
    public static void print(int [] arr, int start, int end) {
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void PrintAllSubArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j = i; j<n; j++){
                print(arr, i, j);
            }
        }
    }
    public static void main(){
        int[] arr = {1,2,3,4,5};
        PrintAllSubArray.print(arr);
    }

}
