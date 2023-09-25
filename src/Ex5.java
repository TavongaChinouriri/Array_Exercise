public class Ex5 {
    //    Write a program to reverse an array.
    public static void main(String[] args) {
        int[] array1 = {12,34,45,65,42,23};
        System.out.println("Original array");
        for (int i=0; i<array1.length; i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array");
        for (int j=(array1.length-1); j>=0; j--){
            System.out.print(array1[j]+" ");
        }
}
}
