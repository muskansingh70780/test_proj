
public class S {
	static int sum;
	void add(int x,int y) {
		sum=x+y;
	}
	

}
class A{
	public static void main(String[] args) {
		S s=new S();
		s.add(1, 2);
		int result=s.sum();
		System.out.println(result);
		
	}
}
