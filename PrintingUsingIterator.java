import java.util.*;
public class PrintingUsingIterator 
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("Ram");
        a.add("Sitha");
        a.add("Ram");
        //Printing using iterator
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}
