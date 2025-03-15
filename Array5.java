//largest three of integers in the array;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.Arrays;

public class Array5 {
    int fst = Integer.MIN_VALUE,sec =Integer.MIN_VALUE,thrd=Integer.MIN_VALUE;
    public void largestthree(){
        int Arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array:");
        for(int i =0 ;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        int n = Arr.length;
        if(n>3){
            System.out.println("the array must have the 3 elemets in it :");
        }
        for(int num:Arr){
            if(num>fst){
                thrd= sec;
                sec=fst;
                fst=num;
            }
            else if(num>sec && num!=fst){
                thrd =sec;
                sec= num;

            }
            else if(num>thrd){
                num=thrd;
            }
        }
        System.out.println("the largest three numbers are: First: "+fst+ " second: "+sec+ "" +
                " third :" +thrd);


    }
    public static void main(String[] args) {
        Array5 Y = new Array5();
        Y.largestthree();
    }
}
