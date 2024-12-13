import java.util.*;
public class PrintingHashmap 
{
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<> ();
        a.put("sno","01");
        a.put("sname","Ram");
        System.out.println(a);
        //printing hash map
        if(a.containsKey("sname"))
        {
            String d=a.get("sname");
            System.out.println(d);
        }
    }
}