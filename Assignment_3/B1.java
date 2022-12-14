import java.util.*;

public class B1
{
    public static void main(String[] args)
    {
        LinkedList li = new LinkedList();
        li.add("Red");
        li.add("Blue");
        li.add("Yellow");
        li.add("Orange");

        System.out.println(li);
        System.out.println("\nContents of the List using an Iterator:");
        ListIterator itr = li.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("\nContents of the List in reverse order using a ListIterator:");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }

        LinkedList l2 = new LinkedList(li);
        l2.add(2,"Pink");
        l2.add(3,"Green");
        System.out.println(l2);
    }
}