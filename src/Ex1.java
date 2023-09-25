public class Ex1
{
//    Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {
        float[] array1 = {22f,37f,15f,25f,51f};
        float sum = 0;
        for (int i=0; i<array1.length; i++){
            sum = sum+array1[i];
            System.out.print(array1[i]+" + ");
        }
        System.out.println("0 = " + sum);
    }
}