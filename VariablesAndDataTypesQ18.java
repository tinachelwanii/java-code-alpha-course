
//type promotion in expression
import java.util.*;

public class VariablesAndDataTypesQ18 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) (b));
        System.out.println((int) (a));
        System.out.println(a);
        System.out.println(b - a);
    }
}
// type promitions is used for expressions where operations like + - * % are
// there
// javaautomatically promotes each byte,short,or char operand to int when
// evaluating an expression