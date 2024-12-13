import java.util.*;
public class LinkedListSet 
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Student");
        a.add("Ram");
        a.add("Student");
        System.out.println(a);
        //Removing an item from set
        a.remove("Ram");
        System.out.println(a);
        //Clearing Linked list set
        a.clear();
        System.out.println(a);
    }
    
}