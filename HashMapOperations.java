import java.util.*;
public class HashMapOperations 
{
    public static void main(String args[])
    {
        HashMap<String,String> a=new HashMap<> ();
        a.put("sno","01");
        a.put("sname","Ram");
        a.put("city","Banglore");
        System.out.println(a);
        //modifying value for a key
        a.put("sno","90");
        System.out.println(a);
        //removing key in a hashmap
        a.remove("sname");
        System.out.println(a);
        //clear keys in hashmap
        a.clear();
        System.out.println(a);
    }
}