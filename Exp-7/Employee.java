class Employee{
String name;
String job;
double salary;
double calculatesalary(int workingDays){
double dailysalary=salary/30;
return dailysalary*workingDays;
}
void updatesalary(int workingDays){
salary=calculatesalary(workingDays);
}
void display(){
System.out.println("Name="+name);
 System.out.println("Job="+job);
System.out.println("Salary="+salary);
}
public static void main(String args[]){
Employee e=new Employee();
e.name="Dipu";
e.job="Manager";
e.salary=30000;
double newsalary=e.calculatesalary(25);
System.out.println("calculate salary="+newsalary);
e.updatesalary(25);
System.out.println("update Employee Details");
e.display();
}
}