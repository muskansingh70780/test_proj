import java.util.Scanner;
public class Array {
	public static void main(String args[]) {
	    int sum=0;
		Scanner sc = new Scanner(System.in); 
		int[] Arr=new int[10];
		for(int i=0;i<10;i++) {
			Arr[i] = sc.nextInt(); 
			
			System.out.println(Arr[i]*Arr[i]);
		
	}
	for(int i=0;i<10;i++){
	   
	    sum=sum+Arr[i];
	}
	System.out.println("Sum of elements of array is:"+sum);
	
		
	}

}
