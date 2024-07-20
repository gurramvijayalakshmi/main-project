interface CarStart
{
void start();
}
interface CarStop
{
void stop();
}
public class Car implements CarStart,CarStop
{
public void start()
{
System.out.println("The car engine has been started");
}
public void stop()
{
System.out.println("The car engine has been stopped");
}
public static void main(String args[])
{
Car c=new Car();
c.start();
c.stop();
}
}

