
//type promotion
import java.util.*;

public class VariablesAndDataTypesQ19 {
    public static void main(String args[]) {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
// if 1 operand is long ,float or double the whole expression is promoted to
// long ,float or double respectively