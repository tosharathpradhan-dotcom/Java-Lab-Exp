interface Printer{
   void print();
}
interface Scanner{
   void scan();
}
class Demo implements printer,scan{
  public void print(){
    System.out.println("It will print for you");
}
public void Scan(){
   System.out.println("It will scan for you");
     }
}

class ASQS{
public static void main(String[]args){
Demo d=new Demo();
d.Scan();
d.print();
    }

}