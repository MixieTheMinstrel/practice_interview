import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSortArray(int[] arr){

        int temp;

        if (arr == null || arr.length < 1){
            return arr;
        }
        for (int i = 0; i < (arr.length); i++){

            for (int j = 0; j < arr.length - i - 1; j++){

                //if left is greater than right
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        int[] memes = {9, 7, 5, 3, 2, 1};
        memes = bubbleSortArray(memes);
        System.out.println(Arrays.toString(memes));
    }
}
