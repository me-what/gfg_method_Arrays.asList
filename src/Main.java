import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] argv) throws Exception
    {
        // 1
        try {
            String a[] = new String[] { "A", "B", "C", "D" };
            List<String> list = Arrays.asList(a);
            System.out.println("The list is: " + list);
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }


// 2
        try {
            Integer a[] = new Integer[] { 10, 20, 30, 40 };
            List<Integer> list = Arrays.asList(a);
            System.out.println("The list is: " + list);
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }


// 3
        try {
            Integer a[] = new Integer[] { 10, 20, 30, 40 };
            List<Integer> list = Arrays.asList(a);
            list.add(50);
            System.out.println("The list is: " + list);
        }

        catch (UnsupportedOperationException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}