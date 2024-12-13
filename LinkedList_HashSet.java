import java.util.*;
public class LinkedList_HashSet 
{
    public static void main(String args[])
    {
    LinkedHashSet <String> a=new LinkedHashSet<> ();
    a.add("Hello");
    a.add("Hello");
    a.add("Students");
    a.add("Ram");
    a.add("Student");
    //Iterator
    for(String s:a)
    {
        System.out.println(s+" ");
    }
    }
    
}
