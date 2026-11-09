class Vehicle{
String make;
String model;
int year;
double fuel;
Vehicle(String make,String model,int year,double fuel){
this.make=make;
this.model=model;
this.year=year;
this.fuel=fuel;
}
void fuelEfficiency(){
System.out.println("fuel efficiency calculation");
}
void distanceTravelled(){
System.out.println("Distance Travelled");
}
void maxspeed(){
System.out.println("maximum speed");
}
}
class Truck extends Vehicle{
Truck(String make,String model,int year,double fuel){
super(make,model,year,fuel);
}
void fuelEfficiency(){
System.out.println("Truck efficiency:8km/l");
}
void distanceTravelled(){
System.out.println("Truck Distance:400km");
}
void maxspeed(){
System.out.println("Truck maximum speed:100km/h");
}
}
class Car extends Vehicle{
Car(String make,String model,int year,double fuel){
super(make,model,year,fuel);
}
void fuelEfficiency(){
System.out.println("Car efficiency:18km/l");
}
void distanceTravelled(){
System.out.println("Car Distance:500km");
}
void maxspeed(){
System.out.println("Car maximum speed:180km/h");
}
}
class Motorcycle extends Vehicle{
Motorcycle(String make,String model,int year,double fuel){
super(make,model,year,fuel);
}
void fuelEfficiency(){
System.out.println("Motorcycle efficiency:45km/l");
}
void distanceTravelled(){
System.out.println("Motorcycle Distance:300km");
}
void maxspeed(){
System.out.println("Motorcycle maximum speed:120km/h");
}
}
class Main{
public static void main(String args[]){
Car c=new Car("Maruti","Shift",2024,30);
System.out.println(c.make);
System.out.println(c.model);
System.out.println(c.year);
c.fuelEfficiency();
c.distanceTravelled();
c.maxspeed();
}
}






























