import java.util.Arrays;

public class Sep21{
    public static void main(String[] args){
        int[] arr = {10, 7, 4, 9, 8};
        arrayMax(new int[] {10, 7, 4, 9, 8});
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max = arr[arr.length-1];
        System.out.println(max);
    }
    public static int arrayMax(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }}
        System.out.println(max);
        return max;
        }
    public static void sort(int[] a){
        System.out.println(a);

    }
};