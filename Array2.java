import java.util.Arrays;

public class Array2 {
    public void reverse() {
        int arr[] = {1,2,3,4,5,6};
        int left = 0, right = arr.length-1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            right--;
            left++;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Array2 sc = new Array2();
        sc.reverse();
        }


    }

