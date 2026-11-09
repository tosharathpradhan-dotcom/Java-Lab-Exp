import java.lang.*;
class A1q4{
public static void main(String args[]){
int a=40,b=50;
 System.out.println("Before swap:a="+a+"b="+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("after swap:a="+a+"b="+b);
}
}