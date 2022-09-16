
import java.util.*;
class Employee
{
      String jobstatus;
      String empname;
      int basicsalary;
      int GS;
 
    	 
     
     public void read()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the employee name");
        empname=scan.next();
        System.out.println("Enter the employee job status");
        jobstatus=scan.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary=scan.nextInt();
     }
    
     public void Gross_salary()
     {
    	 String Permanent;
    	 if ( {
    		 double HRA=(10/100)*basicsalary;
             double DA=(50/100)*basicsalary;
             double TA=(5/100)*basicsalary;
             double special_allowance=5000;
             double GS=basicsalary+DA+HRA+TA+special_allowance;
    		 
    	 }
    	 else {
    		 double TA=(5/100)*basicsalary;
    		 double GS=basicsalary+TA;
    	 }
    	 
     }
     public void display()
     {
    	 System.out.println("EmployeeName:"+empname+"n"+"JobStatus:"+jobstatus+"n"+"BasicSalary:"+basicsalary+"n"+"GrossSalary:"+GS);
     }

     
    
     public static void main(String[] args)
     {
         Employee t=new Employee();
         t.read(); //calling read function
         t.Gross_salary();
      }
}
