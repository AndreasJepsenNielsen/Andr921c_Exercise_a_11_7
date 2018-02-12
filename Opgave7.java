import java.util.*;
import java.util.List;

//opgave 7

public class Opgave7 {

    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        List<Integer> b = new LinkedList<>();

        a.add(3);
        a.add(7);
        a.add(3);
        a.add(-1);
        a.add(2);
        a.add(3);
        a.add(7);
        a.add(2);
        a.add(15);
        a.add(15);

        b.add(-5);
        b.add(15);
        b.add(2);
        b.add(-1);
        b.add(7);
        b.add(15);
        b.add(36);

        countCommon(a, b);
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        int count = 0;


        Set<Integer> set = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        set.addAll(list1);
        set2.addAll(list2);
        Iterator it = set2.iterator();
        for (int i = 0; i < set2.size() ; i++)
        {
            if(set.contains(it.next())) // hvis vores set indeholder numret bliver der tilføjet 1 til count, og den tæller derfor hver gang der er en int der fremtræder i begger lister
            {
                count++;
            }
        }

        System.out.println(count); // udskriver count for at se hvor mange commons der er
        return count;


    }
}

