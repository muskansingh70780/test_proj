class Super
{
private int l,b;
int a;
Super(int x,int y)
{ l=x; b=y;}
private int area()
{return(l*b);}
int s_area()
{return(a*a);}
}
class Sub_Class extends Super
{
int h;
Sub_Class(int x,int y,int z)
{
super(x,y);
h=z;
}
int volume()
{
return(area()*h);
}
int s_volume()
{
	return(s_area());
}
}
class Main
{
public static void main(String args[])
{
Sub_Class cr=new Sub_Class(10,20,15);
int a1=cr.area();
int a2=cr.s_area();
int v1=cr.volume();
int v2=cr.volume();
System.out.println("Area of Room : "+a1);
System.out.println("Area of Room : "+a2);
System.out.println("Volume of Room : "+v1);
System.out.println("Volume of Room : "+v2);
}
}
