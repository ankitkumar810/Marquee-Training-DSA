package array;

public class MaxConsecutiveBit {
    public int maxConsecBits(int[] arr) {
        // code here
        int maxCount = 1;
        int currentCount = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[i-1]) {
                currentCount++;
            } else {
                currentCount=1;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }
}