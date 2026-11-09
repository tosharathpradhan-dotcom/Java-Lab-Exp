import java.util.Scanner;
class A3q4{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println("Enter a no:");
int num;
num=sc.nextInt();
if(num>0){
System.out.println("positive");
}
else if(num<0){
System.out.println("negetive");
}
else{
System.out.println("Zero");
}
}
}