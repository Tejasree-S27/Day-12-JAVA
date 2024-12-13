import java.util.*;
class AcceptingLinkedList
{
    public static void main(String args[])
    {
        LinkedList<String> a=new LinkedList<>();
        //Accepting values into list
        a.add("Hello");
        a.add("I am");
        a.add("Students");
        System.out.println(a);
        //Removing values in the list
        a.remove(0);
        System.out.println(a);
        //Clearing the List
        a.clear();
        System.out.println(a);
    }

}