class Employee
{
    String name;
    int empid;
    int salary;
    Employee(){
        name=Muskan;
        empid=1;
        salary=1000000;
        
    }
    Employee(String n,int e,int s)
    {
        name=n;
        empid=e;
        salary=s;
    }
    public int getNmae()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }
    public int increaseSalary()
    {
        int s;
        s=salary+0.1;
    }
}
class Manager extends Employee{
    String dept;
    Manager(Manager m){
        super(m);
        dept=m.dept;
    }
    Manager(String n,int e,int s,String d){
        super(n,e,s);
        dept=d;
    }
}
class Demo{
    public static void main(String args[]){
        Manager m1=new Manager();
        System.out.println("enter the department of the employee:"+m1.dept);
        System.out.println("enter the name of the employee:"+m1.name);
        System.out.println("enter the salary of the employee:"+m1.salary);
    }
}

