import java.util.Scanner;
class A3q5{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
int sp,cp,pro,los,l,p;

System.out.println("Enter sell price:");
sp=sc.nextInt();
System.out.println("Enter cost price:");
cp=sc.nextInt();

if(sp>cp){
p=sp-cp;
pro=(p*100)/cp;
System.out.println("profit="+p);
System.out.println(pro);
}

else{
l=cp-sp;
los=(l*100)/cp;
System.out.println("loss="+l);
System.out.println(los);
}
}
}