import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//opgave 7

public class Opgave7 {

    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();
        List<Integer> b = new LinkedList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(-1);
        a.add(5);
        a.add(5);

        b.add(4);
        b.add(4);
        b.add(1);
        b.add(-1);
        b.add(2);
        b.add(5);

        countCommon(a, b);
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        int count = 0;


        Set<Integer> set = new TreeSet<>();

        set.addAll(list1);

        for (int i = 0; i < list2.size() ; i++)
        {
            if(set.contains(list2.get(i))) // hvis vores set indeholder numret bliver der tilføjet 1 til count, og den tæller derfor hver gang der er en int der fremtræder i begger lister
            {
                count++;
            }
        }

        System.out.println(count); // udskriver count for at se hvor mange commons der er
        return count;


    }
}

