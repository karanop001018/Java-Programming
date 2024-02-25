//Q. Write a Java program to find the maximum element in an array

package lecture_29;
import java.util.*;
public class practice_6 {
    public static void main(String[] args) {
        int [] arr = {1,21,3,45,50,33,152,89,94,20};
        int max = 0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The value of the maximum element in this array is : " + max);

    }
}
