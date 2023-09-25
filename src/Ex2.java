import java.util.Scanner;
//    Write a program to find out whether a given integer is present in an array or not.
public class Ex2 {
    public static void main(String[] args) {
        int[] num = {45, 889, 232, 523, 454, 75, 11, 3,4, 120};
        Scanner user = new Scanner(System.in);
        System.out.print("Search number...");
        int toFind = user.nextInt();
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
                    