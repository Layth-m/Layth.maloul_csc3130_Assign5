import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class radix_sort {

    public static void count_sort(List<String>[] array, int place) {
        List<String>[] output = new ArrayList[array.length];

        for (int i = 0; i < array.length; i++) {
            output[i] = new ArrayList<>();
        }
        int[] count = new int[256];

        Arrays.fill(count, 0);

        //occurances
        for (List<String> list : array) {
            for (String s : list) {
                int index = (s.length() >= place) ? s.charAt(s.length() - place) : 0;
                count[index]++;
            }
        }

        //change count[i] to reflext actual position of char in array
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        //build the output array
        for (int i = 0; i < array.length; i++) {
            array[i].clear();
            array[i].addAll(output[i]);
        }
    }

    public static void radixSort(String[] arr){
        int maxLength = getMaxStringLength(arr);
        //convert input to list

        List<String>[] bucketArray = new ArrayList[256];
        for(int i = 0; i<256; i++){
            bucketArray[i] = new ArrayList<>();
        }

        for(String s : arr){
            bucketArray[s.length()].add(s);
        }

        //count sort from right to left

        for(int exp =maxLength; exp>0 ; exp--){
            count_sort(bucketArray,exp);
        }

        //copy the sorted array back to original
        int index = 0;
        for(List<String> list : bucketArray){
            for(String s: list){
                arr[index++]=s;
            }
        }
    }

    private static int getMaxStringLength(String[]arr){
        int maxLength= 0 ;
        for(String s:arr){
            maxLength = Math.max(maxLength, s.length());
        }
        return maxLength;
    }
}

































