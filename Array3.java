import java.util.Arrays;
import java.util.Scanner;
public class Array3 {
    public int largest(){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array that have to implement :");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int j = 0; j < arr.length ;j++){
            if(arr[j]>max){
                max = arr[j];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Array3 d  = new Array3();
        int Largest =d.largest();
        System.out.println(Largest);
    }
}
