class StringBufferExample{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("hello");
System.out.println(sb.capacity());
sb.append("java");
System.out.println(sb.capacity());
sb.ensureCapacity(10);

}
}
