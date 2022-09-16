import java.util.Scanner;
public class Commission {
	String name;
	int salary;
	int sales_value;
	Commission(String name,int salary,int sales_value)
	{
		this.name=name;
		this.salary=salary;
		this.sales_value=sales_value;
		 BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter name of the sales man : " +name); 
         read=Br.readLine();
         System.out.println("Enter the salary  : " +salary); 
         read=Br.readLine();
         System.out.println("Enter the sales_value  : " +sales_value); 
         read=Br.readLine();
         if(salary>=0 && salary<=5000) {
        	 System.out.println("0%");
         }
         else if(salary>5000 && salary<=15000) {
        	 System.out.println("5%");
         }
         else if(salary>15000 && salary<=30000) {
        	 System.out.println("10%");
         }
         else(salary>30000){
        	 System.out.println("20%");
         }
         
	}

	

}
