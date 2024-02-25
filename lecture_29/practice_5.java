//Q. Write a java program to reverse an array.

package lecture_29;
import java.util.*;
public class practice_5 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(l,2);
        for(int i=0; i<n; i++){
            //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element:arr) {
            System.out.println(element + " ");
        }
    }
}
