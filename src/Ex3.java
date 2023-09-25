public class Ex3 {
//    Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
public static void main(String[] args) {
    int [] physics = {52,54,77,32,85,65,58,63,64,42,70};
    int sum=0;
    float average=0;
    int count = physics.length;
    System.out.println(physics.length);
    for (int i=0; i<physics.length; i++){
        sum=sum+physics[i];
    }
    average=sum/count;
    System.out.println("average for the physics marks is "+average);
}
}
