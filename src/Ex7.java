import java.util.Arrays;

public class Ex7 {
//    Write a program to determine whether an array is sorted or not.
        private static boolean isSortedArray(int[] array, int n){
            if(n == 1 || n == 0) return true;
            return array[n-2] <= array[n-1] && isSortedArray(array, n-1);
        }

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            System.out.println("The array " + Arrays.toString(arr) + " " +
                    (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");
            System.out.println("--------");
            arr = new int[]{1,3,2,4,5};
            System.out.println("The array " + Arrays.toString(arr) + " " +
                    (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");

        }
    }

