class Person{
String firstname;
String lastname;
String getfirstname(){
return firstname;
}
String getlastname(){
return lastname;
}
}
class Employee extends Person{
String jobtitle;
String empid;
String getEmployeeID(){
return empid;
}
String getlastname(){
return lastname+"("+jobtitle+")";
}
String getEmployeeInfo(){
return firstname + "" +getlastname()+"-"+ getEmployeeID();
}
public static void main(String args[]){
Employee e=new Employee();
e.empid="Emp101";
e.firstname="Rahul";
e.lastname="Kumar";
e.jobtitle="Software Architecture";
System.out.println(e.getEmployeeInfo());
}
}