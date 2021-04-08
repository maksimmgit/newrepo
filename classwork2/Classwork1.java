package classwork2;

import java.util.Arrays;

public class Classwork1 {
    public static void main(String[] args) {
        int[] arr = {44, 55, 12, 42, 94, 18, 6, 67};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
    public static void sort(int[] arr){
        for(int i = 0; i< arr.length-1;i++){
            int minIndex = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
