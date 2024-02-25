//Q. Create an array of 5 floats and calculate their sum.

package lecture_29;
public class practice_1 {
    public static void main(String[] args) {
        float[] numbers = {36.63f,63.36f,65.21f,94.16f,123.52f};
        float sum = 0;
        for (float element:numbers){
            sum = sum+element;
        }
        System.out.println("The value of sum is : "+ sum);
    }
}
