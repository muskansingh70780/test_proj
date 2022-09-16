import java.util.*;
public class Muskan {
	public static void main(String[]args) {
		int sum=0;
		for(int i=41;i<250;i++) {
			if(i%5==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of all integers greater than 40 but less than 250 is"+sum);

	}
		
	
}
