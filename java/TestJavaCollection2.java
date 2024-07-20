import java.util.*;
class TestJavaCollection2
{
public static void main(String args[])
{
LinkedList<String> list=new LinkedList<String>();
list.add("Ramya");
list.add("yaswitha");
list.add("madiha");
list.add("pravallika");
list.add("tanuja");

Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}