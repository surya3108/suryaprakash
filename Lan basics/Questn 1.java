
class Simple
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
char a = sc.next().charAt(0);
char b = sc.next().charAt(0);
if(a-b>0)
{
System.out.println(b+","+a);
}
else if(a-b<0)
{
System.out.println(a+","+b);
}
else
{
System.out.println(a+","+b);
}
}
}
