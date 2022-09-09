import java.util.Arrays;
public class weightage {
    public static void main(String[] args) {
        int[] array = {49, 36, 8, 10, 12};
        int[] arrayWithWeightage = new int[5];
        int perfectsquare = 0, i = 0, j = 0, temp = 0;
        for (i=0;i<5;i++) {
            perfectsquare = (int) Math.sqrt(array[i]);
            if (array[i] == perfectsquare * perfectsquare)
                arrayWithWeightage[i] += 5;
            if ((array[i] % 4 == 0) && (array[i] % 6 == 0))
                arrayWithWeightage[i] += 4;
            if (array[i] % 2 == 0)
                arrayWithWeightage[i] += 3;
        }
        for (i=0;i<5;i++) {
            for (j=i+1;j<5;j++) {
                if (arrayWithWeightage[i] < arrayWithWeightage[j]) {
                    temp = arrayWithWeightage[i];
                    arrayWithWeightage[i] = arrayWithWeightage[j];
                    arrayWithWeightage[j] = temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(i=0;i<5;i++)
            System.out.print("<"+ array[i] +" , "+arrayWithWeightage[i]+" > "+ " ");
    }
}
