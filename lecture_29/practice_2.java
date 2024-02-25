//Q. Write a program to find out weather a given integer is present in an array or not.

package lecture_29;
import java.util.*;
public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] marks = {36.63f,63.36f,65.21f,94.16f,123.52f};
        float num = sc.nextFloat();
        boolean isInArray = false;
        for(float element:marks){
            if(num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array");
        }
        else {
            System.out.println("The value is not present in the array");
        }
    }
}
