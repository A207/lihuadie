package fruit;

public class Fruit {
   String name;
   int price;
   String addr;
   
   Fruit(){}
   Fruit(String n,int p,String a){
	   name=n;
	   price=p;
	   addr=a;
   }
   
   public static void main(String[] args){
	   Fruit f=new Fruit("ƻ��",5,"ɽ����̨");
	   System.out.println(f.name);
   }
}
