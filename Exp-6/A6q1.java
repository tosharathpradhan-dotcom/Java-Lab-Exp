class A6q1{
public static void main(String args[]){
int a[]={100,20,30,10,50};
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length-1-i;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("using bubble sort");
System.out.print("output:[");
for(int i=0;i<a.length;i++){
System.out.print(a[i]);
if(i<a.length-1){
System.out.print(",");
}
}
System.out.println("]");
}
}