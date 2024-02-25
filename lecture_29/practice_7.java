package lecture_29;
import java.util.*;
public class practice_7 {
    public static void main(String[] args) {
        int [] arr = {1,21,3,45,50,33,152,89,94,20};
        int max = Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The value of the maximum element in this array is : " + max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
