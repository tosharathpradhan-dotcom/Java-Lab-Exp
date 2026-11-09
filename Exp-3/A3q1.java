import java.util.Scanner;
class A3q1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st subject mark");
double s1=sc.nextDouble();

System.out.println("Enter 2nd subject mark");
double s2=sc.nextDouble();

System.out.println("Enter 3rd subject mark");
double s3=sc.nextDouble();

System.out.println("Enter 4th subject mark");
double s4=sc.nextDouble();

System.out.println("Enter 5th subject mark");
double s5=sc.nextDouble();

System.out.println("Total mark:");
double Total=s1+s2+s3+s4+s5;

System.out.println("Percentge:");
double Percentge=(Total/500.0)*100;

System.out.println(Total);
System.out.println(Percentge);
}
}


