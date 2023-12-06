
//ConditionalStatements
//else if video
import java.util.*;

public class ConditionalStatements4 {
    public static void main(String[] args) {
        int age = 13;

        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }
    }
}
// by writing if else the else condition only runs when if condition is false
// but if if condition is true then else condition wont run it will save the
// computers extra check
// in the case of if if condition even if the first is true then also it will
// run second if condition