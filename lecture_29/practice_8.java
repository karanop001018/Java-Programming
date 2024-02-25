//Q. Write a java program to find weather an array isa sorted or not.

package lecture_29;
import java.util.*;
public class practice_8 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {1, 3, 4, 5, 34, 67};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }


/*
        boolean isSorted = true;
        int [] arr = {1,30,14,5,34,67};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
 */
    }
}
