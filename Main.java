class A{
public B b=new B();
}
class B{
 public int c=10;
public int a=9;
}

public class Main
{
  public static void main(String[] args)
{
A a=new A();
A c=new A();
a.b.c=c.b.a;
}
}