import java.util.Scanner;
public class x_pattern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter odd Character String");
        char[] pattern = s.next().toCharArray();
        if (pattern.length % 2 != 0) {
            for (int i = 0; i < pattern.length; i++) {
               for (int j = 0; j < pattern.length; j++) {
                   if (i == j || j == pattern.length-1-i )
                      System.out.print(pattern[j]);
                   else
                       System.out.print(" ");
                    }
                System.out.println(" ");
                }
            }
            else
                System.out.println("0");
        }
    }
