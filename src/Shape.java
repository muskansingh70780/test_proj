interface Shape {
	//public static constant=variables
	final float pi=3.14f;
	float area(int);

}
class Circle implements Shape
{
	final float pi=3.14f;
	float area(int r)
	{
		return pi*r*r;
	}
	
}
class Main
{
	public static void main(String[] arg)
	{
		Circle c1=new Circle();
		float ar=c1.area(2);
		System.out.println(ar);
	}
}
