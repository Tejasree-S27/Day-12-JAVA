import java.util.*;
public class AddFirst_AddLast_LinkedListSet 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList <Integer> a=new LinkedList<> ();
        int s=sc.nextInt();
        //Adding from first
        for(int i=0;i<s;i++)
        {
            int s1=sc.nextInt();
            a.addFirst(s1);
        }
        for(int i=0;i<s;i++)
        {
            System.out.print(a.get(i)+" ");
        }
        a.clear();
        int r=sc.nextInt();
        //Adding from Last
        for(int i=0;i<r;i++)
        {
            int s1=sc.nextInt();
            a.addLast(s1);
        }
        for(int i=0;i<r;i++)
        {
            System.out.print(a.get(i)+" ");
        }
    }
    
}