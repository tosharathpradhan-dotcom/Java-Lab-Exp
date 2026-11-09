class Vehicle{
void drive(){
System.out.println("Reparing a vehicle");
}
}
class Car extends Vehicle{
void drive(){
System.out.println("Reparing a car");
}
public static void main(String args[]){
Car c=new Car();
c.drive();
}
}
