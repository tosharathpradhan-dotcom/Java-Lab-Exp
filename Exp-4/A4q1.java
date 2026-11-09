import java.util.Scanner;
class A4q1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a");
double a=sc.nextDouble();
System.out.println("Enter b");
double b=sc.nextDouble();
System.out.println("Enter c");
double c=sc.nextDouble();
double d=b*b-4*a*c;
if(d>0){
double r1=(-b+Math.sqrt(d))/2*a;
double r2=(-b-Math.sqrt(d))/2*a;
System.out.println("Root1" +r1);
System.out.println("Root2" +r2);
}
else if(d==0){

double r=-b/2*a;
System.out.println("Root" +r);
}
else{
System.out.println("Root is imaginary");
}
}
}

