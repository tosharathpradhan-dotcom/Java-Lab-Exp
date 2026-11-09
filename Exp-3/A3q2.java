import java.util.Scanner;
class A3q2{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
double s,h,d,g;
System.out.println("Enter salary");
s=sc.nextDouble();
h=(s*10)/100;
d=(s*60)/100;
g=s+h+d;
System.out.println("Gross salary:"+g);
}
}