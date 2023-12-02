
//array as a function arguement
import java.util.*;

public class ArraysQ3 {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
// for running this program type javac -d . ArraysQ3.java
// java ArraysQ3
// these commands in java