import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = weight.length -1; i >= 0; i--) {
            System.out.print(weight[i]);{
                if(i != 0)
                    System.out.print(", ");

            }

        }
        System.out.println();

        double [] weight1 = {1.57, 7.654, 9.986};
        for (int a = weight1.length - 1; a >= 0; a--) {
            System.out.print(weight1[a]);
            {
                if (a != 0)
                    System.out.print(", ");
            }
        }
        System.out.println();

        char[] weight3 = {'a', 'b', 'c', 'd'};
        for (int a = weight3.length-1; a >= 0; a--) {
            System.out.print(weight3[a]);
            {
                if (a != 0)
                    System.out.print(", ");
            }
        }
        System.out.println();

        int [] weight4 = {1, 2, 3};
        for (int i = 0; i < weight4.length ; i++) {
            if (weight4[i] % 2 != 0){
                weight4[i] += 1;
            }

        } System.out.println(Arrays.toString(weight4));


    }

}