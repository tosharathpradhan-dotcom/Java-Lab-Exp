class Interest{
void SI(double principle,int time){
double rate=5;
double si=(principle*rate*time)/100;
System.out.println("simple Interest="+si);
}
void SI(int rate,int time){
double principle=10000;
double si=(principle*rate*time)/100;
System.out.println("simple Interest="+si);
}
public static void main(String args[]){
Interest obj=new Interest();
obj.SI(50000.0,2);
obj.SI(8,2);
}
}