package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
odd length from the set.
 */
public class Exercise10 {
    public static void main(String[] args)
    {
        Set<String> list = new HashSet<>();
        list.add("Todd");
        list.add("Sophie");
        list.add("Sofie");
        list.add("Charlotte");
        list.add("Fred");
        list.add("James");
        list.add("William");

        Exercise10 exercise10 = new Exercise10();
        exercise10.removeEvenLength(list);
        System.out.println(list);
    }

    private void removeEvenLength(Set<String> list)
    {
        Iterator<String> itr = list.iterator();

        while (itr.hasNext())
        {
            String current = itr.next();
            if (current.length()%2 == 0) itr.remove();
        }
    }
}
