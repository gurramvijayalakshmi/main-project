class sample
{
private int id;
sample()
{
id=101;
System.out.println("Default Constructor with id:"+id);
}
sample(int no)
{
id=no;
System.out.println("Default Constructer with arguments with id:"+id);
}
}
public class Demo
{
public static void main(String[] args)
{
sample s1=new sample();
sample s2=new sample(3122);
}
}