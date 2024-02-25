//Q. Calculate the average marks from an array containing marks of all students in Physics usingfor-each loop

package lecture_29;
import java.util.*;
public class practice_3 {
    public static void main(String[] args) {
        float [] marks = {63.25f,60.66f,88.65f,99.20f,100.00f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is : " + sum/marks.length);
    }
}
