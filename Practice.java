import java.util.*;

public class Practice
{
    public static void main(String[] args)
    {
        LinkedList ls = new LinkedList();
        ls.add("Red");
        ls.add("Blue");
        ls.add("Yellow");
        ls.add("Orange");
        System.out.println(ls);

        ListIterator itr = ls.listIterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

        LinkedList l2 = new LinkedList();
        l2.add("Pink");
        l2.add("Green");

        ls.add(2,l2);
        System.out.println(ls);
    }
}