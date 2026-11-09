class Shape{
static double pi=3.14;
double radius;
void getperimeter(){}
void getarea(){}
}
class Circle extends Shape{
void getperimeter(){
System.out.println(2*pi*radius);
}
void getarea(){
System.out.println(pi*radius*radius);
}
public static void main(String args[]){
Circle c=new Circle();
c.radius=2.5;
c.getperimeter();
c.getarea();
}
}