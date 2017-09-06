public class RangeEncoding {
  
    public int minRanges(int[] arr) {
        int minR = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] > arr[i] + 1) {
                minR++;
            }
        }
        
        return minR;
    }
}
