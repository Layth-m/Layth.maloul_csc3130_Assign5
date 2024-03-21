// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {

  
        System.out.println();
        //Testing for sub_integer method;
        Set<Integer> S = new HashSet<>();
        S.add(32);
        S.add(3);
        Set<Integer> T = new HashSet<>();
        T.add(1);
        T.add(2);
        T.add(3);
        T.add(52);
        T.add(32);
        T.add(54);

        sub_integer test = new sub_integer();
        System.out.print(test.is_subset(S,T));



    }
}
