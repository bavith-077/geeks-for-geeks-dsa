import java.util.Arrays;
import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int[6];
        System.out.println("enter the array that need to be insert");
        for(int i=0;i<6; i++){
            Arr[i]=sc.nextInt();
        }
        for(int j =0; j< Arr.length; j=j+2){
            int output = Arr[j];
            System.out.println(output);
        }


    }
}
