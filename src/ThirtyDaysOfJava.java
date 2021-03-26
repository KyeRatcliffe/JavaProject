import java.lang.reflect.Array;


public class ThirtyDaysOfJava {

    public static void main(String[] args) {

        int [] [] data = {
                {4,3,7,2},
                {5,4,9,2, 6, 4, 3},
                {7,4,3,6}
        };

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
