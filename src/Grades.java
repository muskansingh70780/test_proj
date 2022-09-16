import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
    	 int[] marks=new int[]{90,80,23,55,95,68,53,70,77,66};
    	 for(int i=0;i<marks.length;i++) {
    		 for(int j=i+1;j<marks.length;j++) {
    			 int a=0;
    			 if(marks[i]>marks[j]) {
    				 a=marks[i];
    				 marks[i]=marks[j];
    				 marks[j]=a;
    			 }
    		 }
    	 }
    	 for(int i=0;i<marks.length;i++) {
    		 System.out.println(marks[i]);
    	 }
    	 System.out.println("The students grades are:");
 		for(int i=0;i<=10;i++) {
    	 if(marks[i]>40 && marks[i]<50) {
				System.out.println("PASS");
			}
			else if(marks[i]>51 && marks[i]<75) {
				System.out.println("MERIT");
			}
			else {
				System.out.println("DISTINCTION");
			}
			
		}
    	 
		
	}
		
		
		
		
		}

