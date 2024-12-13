import java.util.*;
public class HashMap_KeyCount 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> a=new HashMap<>();
    for(int a1:arr)
    {
        if(a.containsKey(a1))
        {
            a.put(a1,a.get(a1)+1);
        }
        else{
            a.put(a1,1);
        }
    }
    System.out.println(a);

}
}