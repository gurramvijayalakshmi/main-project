class employee{
int id;
String name;
int sal;

void setId(int n)
{
id=n;
}
void setName(String y)
{
name=y;
}
void setSal(int s){
sal=s;
}
void getEmpDetails()
{
System.out.println(name+"salary is"+sal);
}
}
public class EmpDemo{
public static void main(String[] args)
{
employee emp1=new employee();
emp1.setId(101);
emp1.setName("Ramya");
emp1.setSal(40000);
emp1.getEmpDetails();
}
}

