class Employee{
String name;
double salary;
int hiredate;
int yearofservice(int date){
int currentyear=2026;
hiredate=currentyear-date;
return hiredate;
}
void display(){
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("yearofservice:"+hiredate);
}
public static void main(String args[]){
Employee e=new Employee();
e.name="Dipu";
e.salary=50000.0;
e.yearofservice(2021);
e.display();
}
}