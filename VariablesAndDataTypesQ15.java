
//area of circle
import java.util.*;

public class VariablesAndDataTypesQ15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        // if we put f it becomesw floating value if we dont put f it becomes double
        // value
        System.out.println(area);
    }
}
