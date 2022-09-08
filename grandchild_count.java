public class grandchild_count {
    public static void main(String[] args) {
        String[][] arr= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        int m=0,n=0,grandchild=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = 1; j<=1; j++) {
                if (arr[i][j] == "ronaldo") {
                    m = i;
                    n = j - 1;//rooney
                }
            }
        }
       for(int i=0;i<arr.length;i++) {
            for(int j=1;j<=1;j++) {
                if ((arr[i][j]) == (arr [m][n]))
                    grandchild++;
            }
        }
        System.out.println("Number of grandchild for ronaldo is " +grandchild);
    }
}
